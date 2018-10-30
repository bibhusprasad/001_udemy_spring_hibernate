package com.udemy.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
    @Value("#{countrysList}") 
    private Map<String, String> countrysList;
    
	@RequestMapping("/")
	public String getMainPage() {
		return "index";
	}
	
	@RequestMapping("/studentForm.do")
	public String getStudentForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("theCountrysList", countrysList);
		return "show-form";
	}
	
	@RequestMapping("/displayForm.do")
	public String getStudentDisplayForm(@ModelAttribute("student") Student std) {
		System.out.println("First name " + std.getFirstName());
		System.out.println("Last name " + std.getLastName());
		System.out.println("Country name " + std.getCountry());
		return "display-form";
	}
}
