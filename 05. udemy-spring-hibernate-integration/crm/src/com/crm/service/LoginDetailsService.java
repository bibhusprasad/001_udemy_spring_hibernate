package com.crm.service;

import com.crm.controller.login.ForgotPassword;
import com.crm.controller.login.Login;
import com.crm.controller.login.Registration;

public interface LoginDetailsService {
	
	public void saveLoginDetailsService(Registration registration);
	public Login fetchLoginDetailsService(Login login);
	public Login resetLoginPasswordService(ForgotPassword forgotPassword);

}
