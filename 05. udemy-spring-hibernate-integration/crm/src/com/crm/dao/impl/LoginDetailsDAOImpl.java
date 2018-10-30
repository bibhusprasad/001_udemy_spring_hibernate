package com.crm.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.entity.LoginEntity;
import com.crm.dao.LoginDetailsDAO;

@Repository
public class LoginDetailsDAOImpl implements LoginDetailsDAO{

	private static final Logger LOG = Logger.getLogger(LoginDetailsDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveLoginDetailsToDb(LoginEntity loginEntity) {
		LOG.debug("CRM::LoginDetailsDAOImpl save login detials.");
		
		Session currrentSession = sessionFactory.getCurrentSession();
		currrentSession.save(loginEntity);
	}
	
	@Override
	@Transactional
	public LoginEntity fetchLoginDetailsFromDb(LoginEntity loginEntity) {
		LOG.debug("CRM::LoginDetailsDAOImpl fetch login detials.");
		
		Session currrentSession = sessionFactory.getCurrentSession();
		String query = "from LoginEntity l where l.username="+"'"+loginEntity.getUsername()+"'";
		LoginEntity loginEntryDb = currrentSession.createQuery(query, LoginEntity.class).getSingleResult();
		if(null != loginEntryDb) {
			return loginEntryDb;
		}
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
