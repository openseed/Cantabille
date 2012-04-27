package cantabille.modules.main;

import cantabille.domain.Settings;
import cantabille.modules.settings.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Keesun Baik
 */
@Controller
public class MainController {

	@Autowired SettingsService settingsService;
	
	@RequestMapping("/home")
	public String home(Model model){
		Settings settings = settingsService.getTheSettings();
		if(settings == null) {
			model.addAttribute("settings", new Settings());
			return "/init";
		} else {
			model.addAttribute("settings", settings);
			return "home";
		}
	}
}
