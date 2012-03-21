package cantabille.modules.posts;

import cantabille.domain.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Keesun Baik
 */
public interface PostsRepository extends MongoRepository<Posts, String> {
}
