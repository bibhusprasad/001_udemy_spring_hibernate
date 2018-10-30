package com.udemy.crm.exception;

public class EnhancedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnhancedException(String message, Throwable cause) {
		super(message, cause);
	}

	public EnhancedException(String message) {
		super(message);
	}

	public EnhancedException(Throwable cause) {
		super(cause);
	}

}
