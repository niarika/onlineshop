package com.sprint1.onlineshop.admin.exception;

public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException(String message) {
		super(message);
	}

	public ProductNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
