package com.atcs.loginassignment.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(value = {ApiRequestException.class, Exception.class})
	public ResponseEntity<Object> handleApiRequestHandler(ApiRequestException e)
	{
		//1. create payload containing exception details
		
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		ApiException apiException = new ApiException(
				e.getMessage(),  
				badRequest,
				ZonedDateTime.now(ZoneId.of("Z"))
		);
		
		//2. return responseentity
		return new ResponseEntity<>(apiException,badRequest);
	}
	
	@ExceptionHandler(value = {HttpMessageNotReadableException.class})
	public ResponseEntity<Object> handleApiRequestHandler(HttpMessageNotReadableException e)
	{
		//1. create payload containing exception details
		
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		ApiException apiException = new ApiException(
				"Country enum is not present",
				badRequest,
				ZonedDateTime.now(ZoneId.of("Z"))
		);
		
		//2. return responseentity
		return new ResponseEntity<>(apiException,badRequest);
	}
}
