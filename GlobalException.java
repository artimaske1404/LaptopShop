package com.laptopshop.work.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> getException(ResourceNotFoundException ex)
	{
		String ms=ex.getMessage();
		ApiResponse obj=new ApiResponse();
		obj.setMessage(ms);
		obj.setStatus(false);
		
		return new ResponseEntity<ApiResponse>(obj,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ResourceFoundException.class)
	public ResponseEntity<ApiResponse> getException(ResourceFoundException ex)
	{
		String ms=ex.getMessage();
		
		ApiResponse obj=new ApiResponse();
		obj.setMessage(ms);
		obj.setStatus(false);
		
		return new ResponseEntity<ApiResponse>(obj,HttpStatus.OK);
	}
}
