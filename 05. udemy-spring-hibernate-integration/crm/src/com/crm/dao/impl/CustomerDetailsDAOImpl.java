package com.crm.dao.impl;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.CustomerDetailsDAO;
import com.crm.dao.entity.CustomerEntity;

@Repository
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO{

	private static final Logger LOG = Logger.getLogger(CustomerDetailsDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveCustomerDetailsToDb(CustomerEntity customerEntity) {
		LOG.debug("CRM::CustomerDetailsDAOImpl save customer details.");
		Session currrentSession = sessionFactory.getCurrentSession();
		currrentSession.saveOrUpdate(customerEntity);
	}
	
	@Override
	@Transactional
	public List<CustomerEntity> fetchCustomerDetailsFromDb() {
		LOG.debug("CRM::CustomerDetailsDAOImpl fetch customer details.");
		
		Session currrentSession = sessionFactory.getCurrentSession();
		String query = "from CustomerEntity";
		List<CustomerEntity> allCustomers = currrentSession.createQuery(query, CustomerEntity.class).getResultList();
		if(null != allCustomers) {
			return allCustomers;
		}
		return Collections.emptyList();
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	@Transactional
	public void deleteCustomerFromDb(int id) {
		LOG.debug("CRM::CustomerDetailsDAOImpl delete customer details.");
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from CustomerEntity where id=:customerId");
		theQuery.setParameter("customerId", id);
		theQuery.executeUpdate();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional
	public List<CustomerEntity> searchCustomerInDb(String theSearchName) {
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


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
