package cantabille.modules.settings;

import cantabille.domain.Settings;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Keesun Baik
 */
public interface SettingsRepository extends MongoRepository<Settings, String> {
}
