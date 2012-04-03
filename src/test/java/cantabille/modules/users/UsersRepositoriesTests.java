package cantabille.modules.users;

import cantabille.commons.test.RepositoryTests;
import cantabille.domain.Users;
import org.junit.Test;

/**
 * @author Keesun Baik
 */
public class UsersRepositoriesTests extends RepositoryTests<UsersRepository> {

	@Test
	public void crud(){
		Users users = new Users();
		users.setEmail("whiteship2000@gmail.com");
		repository.save(users);
	}

}
