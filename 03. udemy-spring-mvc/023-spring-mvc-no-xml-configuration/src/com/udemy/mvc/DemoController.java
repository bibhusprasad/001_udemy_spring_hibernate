package com.udemy.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String getName(Model model) {
		model.addAttribute("name", "Bibhu");
		return "display";
	}
	
}
