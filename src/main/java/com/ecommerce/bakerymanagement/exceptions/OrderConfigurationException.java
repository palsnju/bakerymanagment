package com.ecommerce.bakerymanagement.exceptions;

public class OrderConfigurationException extends Exception {


	private static final long serialVersionUID = 1L;
	
	private OrderConfigurationException(String message) {
		super(message);
	}
	
	private OrderConfigurationException(String message,Throwable th) {
		super(message,th);
	}

	
}
