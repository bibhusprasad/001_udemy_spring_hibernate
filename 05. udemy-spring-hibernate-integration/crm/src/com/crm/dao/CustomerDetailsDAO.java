package com.crm.dao;

import java.util.List;

import com.crm.dao.entity.CustomerEntity;

public interface CustomerDetailsDAO {
	
	public void saveCustomerDetailsToDb(CustomerEntity customerEntity);
	public List<CustomerEntity> fetchCustomerDetailsFromDb();
	public void deleteCustomerFromDb(int id);
	public List<CustomerEntity> searchCustomerInDb(String theSearchName);

}
