package com.customer.sai.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionController {
	
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> exception(NotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}