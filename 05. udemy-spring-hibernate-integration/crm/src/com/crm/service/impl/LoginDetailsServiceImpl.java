package com.crm.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.controller.login.ForgotPassword;
import com.crm.controller.login.Login;
import com.crm.controller.login.Registration;
import com.crm.dao.entity.LoginEntity;
import com.crm.dao.LoginDetailsDAO;
import com.crm.service.LoginDetailsService;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService{
	
	private static final Logger LOG = Logger.getLogger(LoginDetailsServiceImpl.class);
	
	@Autowired
	private LoginDetailsDAO loginDetailsDAO;

	@Override
	public void saveLoginDetailsService(Registration registration) {
		LOG.debug("CRM::LoginDetailsServiceImpl save login details service started.");
		
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setUsername(registration.getUsername());
		loginEntity.setPassword(registration.getPassword());
		loginEntity.setHints(registration.getHints());
		
		loginDetailsDAO.saveLoginDetailsToDb(loginEntity);
	}
	
	@Override
	public Login fetchLoginDetailsService(Login login) {
		LOG.debug("CRM::LoginDetailsServiceImpl fetch login details service started.");
		
		Login loginResult = null;
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setUsername(login.getUsername());
		
		LoginEntity loginEntityDb = loginDetailsDAO.fetchLoginDetailsFromDb(loginEntity);
		if(null != loginEntityDb) {
			if(loginEntityDb.getPassword().equals(login.getPassword())) {
				loginResult = new Login();
				loginResult.setUsername(loginEntityDb.getUsername());
			}
		}
		return loginResult;
	}
	
	@Override
	public Login resetLoginPasswordService(ForgotPassword forgotPassword) {
		LOG.debug("CRM::LoginDetailsServiceImpl fetch login details service started.");
		
		Login loginResult = null;
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setUsername(forgotPassword.getUsername());
		
		LoginEntity loginEntityDb = loginDetailsDAO.fetchLoginDetailsFromDb(loginEntity);
		if(null != loginEntityDb) {
			if(loginEntityDb.getHints().equals(forgotPassword.getHints())) {
				loginResult = new Login();
				loginResult.setUsername(loginEntityDb.getUsername());
			}
		}
		return loginResult;
	}
	
	public LoginDetailsDAO getLoginDetailsDAO() {
		return loginDetailsDAO;
	}

	public void setLoginDetailsDAO(LoginDetailsDAO loginDetailsDAO) {
		this.loginDetailsDAO = loginDetailsDAO;
	}
}
