package com.udemy.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, max=10, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greather than 0")
	@Max(value=10, message="must be less than 10")
	private Integer freePass;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 digit")
	private String zipcode;
	
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
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
