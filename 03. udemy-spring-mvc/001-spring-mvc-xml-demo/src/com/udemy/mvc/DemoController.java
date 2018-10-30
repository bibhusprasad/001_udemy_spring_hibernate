package com.udemy.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String getName() {
		ModelMap model = new ModelMap();
		model.addAttribute("name", "Bibhu");
		return "display";
	}
	
}
