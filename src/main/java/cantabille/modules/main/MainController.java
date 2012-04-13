package cantabille.modules.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Keesun Baik
 */
@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String home(Model model){
		model.addAttribute("name", "Keesun");
		return "home";
	}
}
