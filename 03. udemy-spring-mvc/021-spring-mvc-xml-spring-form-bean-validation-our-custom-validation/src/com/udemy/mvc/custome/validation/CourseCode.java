package com.udemy.mvc.custome.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME )
public @interface CourseCode {

	//default course code
	public String value() default "LUV";

	
	//default course message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payload
	public Class<? extends Payload>[] payload() default {};
}
