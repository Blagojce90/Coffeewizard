package mk.coffeewizard.coffeewizardwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {
	
	@ModelAttribute
	public void createGreeting(ModelMap modelMap) {
		modelMap.put("greeting", "Zdravo od demo 2");
	}
	
	@GetMapping
	public String getDemoPage() {
		return "demo";
	}
	
	@GetMapping("/demo-2")
	public String getDemoPage2() {
		return "demo2";
	}
	
	@PostMapping("/demo-2")
	public String getDataFromForm(ModelMap modelMap, @ModelAttribute AuthenticationDto data) {
		String message = String.format("Vnesovte username %s i passwrod %s", data.getUsername(), data.getPassword());
		modelMap.put("message", message);
		return "demo2";
	}

}
