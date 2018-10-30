package com.udemy.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String processForm() {
		return "display";
	}
	
}
