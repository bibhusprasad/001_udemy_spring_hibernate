package com.udemy.spring.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.udemy.spring.rest.pojo.StudentErrorResponse;

@ControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exp){
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(exp.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleAllException(Exception exp){
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exp.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

}
