package com.udemy.crm.dao;

import java.util.List;

import com.udemy.crm.entity.CustomerEntity;

public interface CustomerDetailsDAO {
	
	public void saveCustomerDeatilsToDb(CustomerEntity customerEntity);
	public List<CustomerEntity> fetchAllCustomerDetailsFromDb();
	public List<CustomerEntity> searchCustomersNameInDb(String theSearchName);
	public CustomerEntity getSingleCustomerDetails(int id);
	public void deleteCustomerFromDb(int id);

}
