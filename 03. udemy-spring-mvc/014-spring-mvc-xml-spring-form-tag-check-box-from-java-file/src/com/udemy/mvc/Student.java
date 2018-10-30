package com.udemy.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private String[] operatingSystem;
	
	private LinkedHashMap<String, String> osList;
	
	public Student() {
		super();
		osList = new LinkedHashMap<>();
		osList.put("Linux", "Linux");
		osList.put("Mac OS", "Mac OS");
		osList.put("Windows OS", "Windows OS");
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
	public String getFavLanguage() {
		return favLanguage;
	}
	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getOsList() {
		return osList;
	}
	
}
