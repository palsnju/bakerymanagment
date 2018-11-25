package com.ecommerce.bakerymanagement.exceptions;

public class BakeryConfigurationException extends Exception {

	private static final long serialVersionUID = 1L;

	private BakeryConfigurationException(String message) {
		super(message);
	}

	private BakeryConfigurationException(Throwable th, String message) {
		super(message, th);
	}
	
	

}
