package com.udemy.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private LinkedHashMap<String, String> languageList;
	
	public Student() {
		super();
		languageList = new LinkedHashMap<>();
		languageList.put("Java", "Java");
		languageList.put("C#", "C#");
		languageList.put("PHP", "PHP");
		languageList.put("Phython", "Phython");
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
	public LinkedHashMap<String, String> getLanguageList() {
		return languageList;
	}
}
