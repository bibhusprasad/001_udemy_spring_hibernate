package com.udemy.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("/")
	public String getMainPage() {
		return "index";
	}
	
	@RequestMapping("/customerForm.do")
	public String getCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/displayForm.do")
	public String getCustomerInfo(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		System.out.println("Last Name : "+theCustomer.getLastName());
		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "display-form";
		}
	}

}
