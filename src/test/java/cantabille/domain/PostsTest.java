package cantabille.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Keesun Baik
 */
public class PostsTest {

	@Test
	public void getterSetter(){
		Posts firstPost = new Posts();
		String content = "Hello Cantabille";
		firstPost.setContent(content);
		assertThat(firstPost.getContent(), is(content));

	}
}
