package cantabille.modules.users;

import cantabille.commons.test.RepositoryTests;
import cantabille.domain.Users;
import org.junit.Test;

/**
 *
 * Please check out that the mongod is running, before run this tests.
 * The mongod running script is in /docs/scripts/run_mongodb.sh
 *
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
