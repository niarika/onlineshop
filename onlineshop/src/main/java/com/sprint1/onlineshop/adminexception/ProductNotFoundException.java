package com.sprint1.onlineshop.adminexception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProductNotFoundException extends RuntimeException{

	public  ProductNotFoundException(String message) {
		super(message);
	}
	public  ProductNotFoundException(String message,Throwable throwable) {
		super(message,throwable);
	}
	

}
