package com.crm.controller.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Registration {
	
	@NotNull(message="is required")
	@Size(min=1, max=10)
	private String username;
	
	@NotNull(message="is required")
	@Size(min=4, max=10)
	private String password;
	
	@NotNull(message="is required")
	@Size(min=1, max=1, message="Enter a number from 1 to 9")
	private String hints;
	
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
	public String getHints() {
		return hints;
	}
	public void setHints(String hints) {
		this.hints = hints;
	}
	
	public Registration() {
		super();
	}
	
	public Registration(String username, String password, String hints) {
		super();
		this.username = username;
		this.password = password;
		this.hints = hints;
	}

}