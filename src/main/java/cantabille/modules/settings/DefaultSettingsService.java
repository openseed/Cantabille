package cantabille.modules.settings;

import cantabille.domain.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Keesun Baik
 */
@Service
public class DefaultSettingsService implements SettingsService {

	@Autowired SettingsRepository repository;

	@Override
	public Settings getTheSettings() {
		List<Settings> settingsList = repository.findAll();
		if(settingsList.size() == 0) {
			return null;
		} else {
			return settingsList.get(0);
		}
	}

}
