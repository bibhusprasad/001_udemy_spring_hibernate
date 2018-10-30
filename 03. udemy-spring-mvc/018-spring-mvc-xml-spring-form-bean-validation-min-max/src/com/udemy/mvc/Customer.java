package com.udemy.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, max=10, message="is required")
	private String lastName;
	
	@Min(value=0, message="must be greather than 0")
	@Max(value=10, message="must be less than 10")
	private int freePass;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFreePass() {
		return freePass;
	}
	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}
	
}
