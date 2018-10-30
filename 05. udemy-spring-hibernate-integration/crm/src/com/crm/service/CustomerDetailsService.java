package com.crm.service;

import java.util.List;

import com.crm.controller.customer.Customer;

public interface CustomerDetailsService {
	
	public void saveCustomerDetailsService(Customer customer);
	public List<Customer> fetchCustomerDetailsService();
	public void deleteCustomerDetailsService(int custId);
	public List<Customer> searchCustomerService(String theSearchName);
}
