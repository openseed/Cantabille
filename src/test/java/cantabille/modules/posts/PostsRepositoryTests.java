package cantabille.modules.posts;

import cantabille.config.AppConfig;
import cantabille.domain.Posts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Keesun Baik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class PostsRepositoryTests {

	@Autowired PostsRepository postsRepository;

	@Before
	public void init(){
		postsRepository.deleteAll();
	}

	@Test
	public void crud(){
		Posts firstPost = new Posts();
		firstPost.setTitle("Hello Toby");
		firstPost.setContent("Hello Cantabille");
		
		postsRepository.save(firstPost);
		assertThat(postsRepository.count(), is(1l));
	}

	@After
	public void destroy(){
		postsRepository.deleteAll();
	}

}
