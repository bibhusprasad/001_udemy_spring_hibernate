package com.crm.controller.customer;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.service.CustomerDetailsService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/customer/index.do")
	public String customerMainPage(Model model) {
		List<Customer> customerList = null;
		try {
			customerList = customerDetailsService.fetchCustomerDetailsService();
		}catch(Exception e) {
			return "login/login-failed";
		}
		model.addAttribute("customers", customerList);
		return "customer/customer-details";
	}
	
	@RequestMapping("/customer/showFormForAdd")
	public String displayCustomerRegistractionPage( Model model) {
		model.addAttribute("customer", new Customer());
		return "customer/customer-register";
	}
	
	@PostMapping("/customer/saveCustomer")
	public String saveCustomerDetails(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "customer/customer-register";
		}
		customerDetailsService.saveCustomerDetailsService(customer);
		return "redirect:/customer/index.do";
	}
	
	@RequestMapping("/customer/showFormForUpdate")
	public String showCustomerUpdationForm(@RequestParam("customerId") int theId, Model model) {
		Customer customer = new Customer();
		customer.setId(theId);
		model.addAttribute("customer", customer);
		return "customer/customer-register";
	}
	
	@RequestMapping("/customer/delete")
	public String deleteCustomerDetails(@RequestParam("customerId") int theId, Model model) {
		customerDetailsService.deleteCustomerDetailsService(theId);
		return "redirect:/customer/index.do";
	}
	
	@PostMapping("/customer/searchCustomer")
    public String searchCustomers(@RequestParam("theSearchName") String theSearchName, Model theModel) {

        // search customers from the service
        List<Customer> theCustomers = customerDetailsService.searchCustomerService(theSearchName);
        theModel.addAttribute("customers", theCustomers);
        return "customer/customer-details";        
    }

	public CustomerDetailsService getCustomerDetailsService() {
		return customerDetailsService;
	}

	public void setCustomerDetailsService(CustomerDetailsService customerDetailsService) {
		this.customerDetailsService = customerDetailsService;
	}
}
