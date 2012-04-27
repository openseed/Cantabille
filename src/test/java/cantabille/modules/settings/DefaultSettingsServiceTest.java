package cantabille.modules.settings;

import cantabille.domain.Settings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author Keesun Baik
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultSettingsServiceTest {

	@Mock SettingsRepository repository;

	DefaultSettingsService service;

	@Before
	public void setUp(){
		service = new DefaultSettingsService();
		service.repository = this.repository;
	}

	@Test
	public void testGetTheSettingsReturnsNull() throws Exception {
		// GIVEN
		List<Settings> settingsList = new ArrayList<Settings>();
		when(repository.findAll()).thenReturn(settingsList);

		// WHEN
		Settings settings = service.getTheSettings();

		// THEN
		assertThat(settings, is(nullValue()));
	}

	@Test
	public void testGetTheSettingsReturnsOneSettings() throws Exception {
		// GIVEN
		List<Settings> settingsList = new ArrayList<Settings>();
		Settings existingSettings = new Settings();
		settingsList.add(existingSettings);

		when(repository.findAll()).thenReturn(settingsList);

		// WHEN
		Settings settings = service.getTheSettings();

		// THEN
		assertThat(settings, is(existingSettings));
	}
}
