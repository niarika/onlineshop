package com.sprint1.onlineshop.userexception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
