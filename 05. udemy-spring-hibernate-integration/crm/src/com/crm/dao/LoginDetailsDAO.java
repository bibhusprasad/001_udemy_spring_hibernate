package com.crm.dao;

import com.crm.dao.entity.LoginEntity;

public interface LoginDetailsDAO {
	
	public void saveLoginDetailsToDb(LoginEntity loginEntity);
	public LoginEntity fetchLoginDetailsFromDb(LoginEntity loginEntity);

}
