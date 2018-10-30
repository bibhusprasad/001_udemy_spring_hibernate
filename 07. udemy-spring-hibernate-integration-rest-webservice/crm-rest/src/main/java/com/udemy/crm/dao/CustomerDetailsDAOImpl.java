package com.udemy.crm.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.crm.entity.CustomerEntity;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Repository
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveCustomerDeatilsToDb(CustomerEntity customerEntity) {
		Session currrentSession = sessionFactory.getCurrentSession();
		currrentSession.saveOrUpdate(customerEntity);
	}
	
	@Override
	@Transactional
	public List<CustomerEntity> fetchAllCustomerDetailsFromDb() {
		
		Session currrentSession = sessionFactory.getCurrentSession();
		String query = "from CustomerEntity";
		List<CustomerEntity> allCustomers = currrentSession.createQuery(query, CustomerEntity.class).getResultList();
		if(null != allCustomers) {
			return allCustomers;
		}
		return Collections.emptyList();
	}
	
	
	@Override
	@Transactional
	public List<CustomerEntity> searchCustomersNameInDb(String theSearchName) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = null;
		if (theSearchName != null && theSearchName.trim().length() > 0) {
			theQuery =currentSession.createQuery("from CustomerEntity where lower(firstName) like :theName or lower(lastName) like :theName", CustomerEntity.class);
			theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
		}else {
            // theSearchName is empty ... so just get all customers
            theQuery =currentSession.createQuery("from CustomerEntity", CustomerEntity.class);            
        }
		List<CustomerEntity> allCustomers = theQuery.getResultList();
		return allCustomers;
	}
	
	@Override
	@Transactional
	public CustomerEntity getSingleCustomerDetails(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		String query = "from CustomerEntity where id=:customerId";
		Query theQuery = currentSession.createQuery(query, CustomerEntity.class);
		theQuery.setParameter("customerId", id);
		return (CustomerEntity) theQuery.getSingleResult();
	}
	
	@Override
	@Transactional
	public void deleteCustomerFromDb(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from CustomerEntity where id=:customerId");
		theQuery.setParameter("customerId", id);
		theQuery.executeUpdate();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
