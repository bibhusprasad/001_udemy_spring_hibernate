package com.crm.controller.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
	
	@NotNull(message="is required")
	@Size(min=1, max=10)
	private String username;
	
	@NotNull(message="is required")
	@Size(min=4, max=10)
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login() {
		super();
	}
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
