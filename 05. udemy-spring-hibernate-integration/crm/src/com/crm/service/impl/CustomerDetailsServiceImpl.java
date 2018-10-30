package com.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.controller.customer.Customer;
import com.crm.dao.CustomerDetailsDAO;
import com.crm.dao.entity.CustomerEntity;
import com.crm.service.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{
	
	private static final Logger LOG = Logger.getLogger(CustomerDetailsServiceImpl.class);
	
	@Autowired
	private CustomerDetailsDAO customerDetailsDAO;
	
	@Override
	public void saveCustomerDetailsService(Customer customer) {

		LOG.debug("CRM::CustomerDetailsServiceImpl save customer details service started.");
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setFirstName(customer.getFirstName());
		customerEntity.setLastName(customer.getLastName());
		customerEntity.setEmail(customer.getEmail());
		customerDetailsDAO.saveCustomerDetailsToDb(customerEntity);

	}

	@Override
	public List<Customer> fetchCustomerDetailsService() {
		List<Customer> customerList = new ArrayList<>();
		LOG.debug("CRM::CustomerDetailsServiceImpl fetch customer details service started.");
		List<CustomerEntity> allCustomers = customerDetailsDAO.fetchCustomerDetailsFromDb();
		
		for(CustomerEntity customerEntity : allCustomers) {
			Customer customer = new Customer();
			customer.setId(customerEntity.getId());
			customer.setFirstName(customerEntity.getFirstName());
			customer.setLastName(customerEntity.getLastName());
			customer.setEmail(customerEntity.getEmail());
			customerList.add(customer);
		}
		return customerList;
	}
	
	@Override
	public List<Customer> searchCustomerService(String theSearchName) {
		List<Customer> customerList = new ArrayList<>();
		List<CustomerEntity> allCustomers = customerDetailsDAO.searchCustomerInDb(theSearchName);
		for(CustomerEntity customerEntity : allCustomers) {
			Customer customer = new Customer();
			customer.setId(customerEntity.getId());
			customer.setFirstName(customerEntity.getFirstName());
			customer.setLastName(customerEntity.getLastName());
			customer.setEmail(customerEntity.getEmail());
			customerList.add(customer);
		}
		return customerList;
	}
	
	@Override
	public void deleteCustomerDetailsService(int custId) {
		customerDetailsDAO.deleteCustomerFromDb(custId);
	}

	public CustomerDetailsDAO getCustomerDetailsDAO() {
		return customerDetailsDAO;
	}

	public void setCustomerDetailsDAO(CustomerDetailsDAO customerDetailsDAO) {
		this.customerDetailsDAO = customerDetailsDAO;
	}

}
