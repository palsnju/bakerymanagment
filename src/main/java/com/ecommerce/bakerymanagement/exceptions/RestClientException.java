package com.ecommerce.bakerymanagement.exceptions;

public class RestClientException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	private RestClientException(String message) {
		super(message);
	}
	
	private RestClientException(String message,Throwable th) {
		super(message, th);
	}
	

}
