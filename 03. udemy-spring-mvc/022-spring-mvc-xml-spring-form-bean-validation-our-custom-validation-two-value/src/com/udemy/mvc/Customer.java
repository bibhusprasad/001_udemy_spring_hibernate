package com.udemy.mvc;

import com.udemy.mvc.custome.validation.CourseCode;

public class Customer {
	
	private String firstName;
	private String lastName;
	@CourseCode(value= {"LUV","TOPS"}, message="must start with LUV or TOPS")
	private String courseCode;
	
	
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
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
