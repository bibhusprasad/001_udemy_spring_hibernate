package com.udemy.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("/show.do")
	public String showForm() {
		return "login";
	}
	
	@RequestMapping(value = "/process.do", method = RequestMethod.POST)
	public String processForm(@RequestParam("getName") String name, Model model) {
		name = name.toUpperCase();
		String message = "Yo! " + name;
		model.addAttribute("message", message);
		return "display";
	}
	
}
