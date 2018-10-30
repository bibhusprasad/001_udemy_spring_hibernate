package com.udemy.crm.service;

import java.util.List;

import com.udemy.crm.controller.Customer;

public interface CustomerDetailsService {
	
	public void saveCustomerDetailsService(Customer customer);
	public List<Customer> fetchAllCustomerDetailsService();
	public List<Customer> searchCustomerByNameService(String theSearchName);
	public Customer getSingleCustomerDetailsService(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomerDetailsService(int custId);
}
