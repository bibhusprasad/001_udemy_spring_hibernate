package com.udemy.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	LinkedHashMap<String, String> countrysList;
	
	public Student() {
		super();
		countrysList = new LinkedHashMap<>();
		countrysList.put("IND", "India");
		countrysList.put("US", "America");
		countrysList.put("SL", "Sri Lanka");
		countrysList.put("AUS", "Australia");
	}
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountrysList() {
		return countrysList;
	}
	
}
