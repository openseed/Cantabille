package cantabille.modules.users;

import cantabille.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Keesun Baik
 */
public interface UsersRepository extends MongoRepository<Users, String> {
}
