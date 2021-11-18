package com.sprint1.onlineshop.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sprint1.onlineshop.admin.exception.ProductNotFoundException;
import com.sprint1.onlineshop.user.exception.ProfileNotFoundException;
import com.sprint1.onlineshop.user.exception.UserNotFoundException;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> ProductNotFoundExceptionHandler(Exception e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> UserNotFoundExceptionHandler(Exception e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ProfileNotFoundException.class)
	public ResponseEntity<Object> ProfileNotFoundExceptionHandler(Exception e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

}
