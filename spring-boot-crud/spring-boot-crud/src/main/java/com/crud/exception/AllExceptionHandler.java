package com.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class AllExceptionHandler extends ResponseEntityExceptionHandler  {
	
	
	@ResponseBody
	@ExceptionHandler(UsersNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	 String response(UsersNotFoundException e)
	{
		return e.getMessage(); // new ResponseEntity<>("Id not Exits",HttpStatus.NOT_FOUND);
	}

}
