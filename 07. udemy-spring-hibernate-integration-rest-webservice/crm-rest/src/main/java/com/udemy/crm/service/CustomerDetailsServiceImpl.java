package com.udemy.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.crm.controller.Customer;
import com.udemy.crm.dao.CustomerDetailsDAO;
import com.udemy.crm.entity.CustomerEntity;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsDAO customerDetailsDAO;

	@Override
	@Transactional
	public void saveCustomerDetailsService(Customer customer) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setFirstName(customer.getFirstName());
		customerEntity.setLastName(customer.getLastName());
		customerEntity.setEmail(customer.getEmail());
		customerDetailsDAO.saveCustomerDeatilsToDb(customerEntity);
	}

	@Override
	@Transactional
	public List<Customer> fetchAllCustomerDetailsService() {
		List<Customer> customerList = new ArrayList<>();
		List<CustomerEntity> allCustomers = customerDetailsDAO.fetchAllCustomerDetailsFromDb();

		for (CustomerEntity customerEntity : allCustomers) {
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
	@Transactional
	public List<Customer> searchCustomerByNameService(String theSearchName) {
		List<Customer> customerList = new ArrayList<>();
		List<CustomerEntity> allCustomers = customerDetailsDAO.searchCustomersNameInDb(theSearchName);
		for (CustomerEntity customerEntity : allCustomers) {
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
	@Transactional
	public Customer getSingleCustomerDetailsService(int id) {
		CustomerEntity customerEntity = customerDetailsDAO.getSingleCustomerDetails(id);
		Customer customer = new Customer();
		if(null != customerEntity) {
			customer.setId(customerEntity.getId());
			customer.setFirstName(customerEntity.getFirstName());
			customer.setLastName(customerEntity.getLastName());
			customer.setEmail(customerEntity.getEmail());
		}
		return customer;
	}
	
	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setId(customer.getId());
		customerEntity.setFirstName(customer.getFirstName());
		customerEntity.setLastName(customer.getLastName());
		customerEntity.setEmail(customer.getEmail());
		customerDetailsDAO.saveCustomerDeatilsToDb(customerEntity);
	}
	
	@Override
	@Transactional
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
