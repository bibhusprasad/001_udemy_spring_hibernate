package com.udemy.aop.exception;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}
	
	public CustomException() {
		
	}

	public CustomException(String message) {
		this.message = message;
	}
}
