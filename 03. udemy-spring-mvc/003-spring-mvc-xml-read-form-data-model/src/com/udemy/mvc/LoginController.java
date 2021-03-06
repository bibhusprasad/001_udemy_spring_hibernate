package com.udemy.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String processForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("getName");
		name = name.toUpperCase();
		String message = "Yo! " + name;
		model.addAttribute("message", message);
		return "display";
	}
	
}
