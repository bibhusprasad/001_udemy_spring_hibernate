package com.udemy.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.crm.exception.EnhancedException;
import com.udemy.crm.service.CustomerDetailsService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomerDetails(){
		return customerDetailsService.fetchAllCustomerDetailsService();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getSingleCustomerDetails(@PathVariable String id){
		int custId;
		try {
			custId = Integer.valueOf(id);
		}catch(Exception e) {
			throw new EnhancedException("Please Enter number only.");
		}
		return customerDetailsService.getSingleCustomerDetailsService(custId);
	}
	
	@PostMapping("/customers")
	public List<Customer> saveCustomer(@RequestBody Customer theCustomer){
		theCustomer.setId(0);
		customerDetailsService.saveCustomerDetailsService(theCustomer);
		return customerDetailsService.fetchAllCustomerDetailsService();
	}
	
	@PutMapping("/customers")
	public List<Customer> updateCustomer(@RequestBody Customer theCustomer){
		customerDetailsService.updateCustomer(theCustomer);
		return customerDetailsService.fetchAllCustomerDetailsService();
	}
	
	@DeleteMapping("/customers/{id}")
	public List<Customer> updateCustomer(@PathVariable String id){
		int custId;
		try {
			custId = Integer.valueOf(id);
		}catch(Exception e) {
			throw new EnhancedException("Please Enter number only.");
		}
		customerDetailsService.deleteCustomerDetailsService(custId);
		return customerDetailsService.fetchAllCustomerDetailsService();
	}

}
