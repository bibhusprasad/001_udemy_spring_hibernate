package com.udemy.mvc.custome.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = false;
		if(theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} 
		return result;
	}
}
