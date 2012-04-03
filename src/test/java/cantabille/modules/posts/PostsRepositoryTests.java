package cantabille.modules.posts;

import cantabille.commons.test.RepositoryTests;
import cantabille.domain.Posts;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Keesun Baik
 */
public class PostsRepositoryTests extends RepositoryTests<PostsRepository>{

	@Test
	public void crud(){
		Posts firstPost = new Posts();
		firstPost.setTitle("Hello Toby");
		firstPost.setContent("Hello Cantabille");

		// ADD
		repository.save(firstPost);
		assertThat(repository.count(), is(1l));

		// UPDATE
		firstPost.setTitle("Hello Keesun");
		repository.save(firstPost);
		assertThat(repository.count(), is(1l));

		// GET
		Posts savedPost = repository.findOne(firstPost.getId());
		assertThat(savedPost.getTitle(), is("Hello Keesun"));

		// GET ALL
		List<Posts> posts = repository.findAll();
		assertThat(posts.size(), is(1));

		// DELETE
		repository.delete(firstPost);
		assertThat(repository.count(), is(0l));
	}

}
