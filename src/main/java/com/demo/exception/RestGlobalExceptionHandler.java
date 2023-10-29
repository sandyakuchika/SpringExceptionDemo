package com.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestGlobalExceptionHandler {
	
	@ExceptionHandler(value=NoProductFoundException.class)
	public ResponseEntity<ApiError> handleNoProductException() {
		ApiError apiError=new ApiError(404, "Requested Product Not Found", new Date());
		return new ResponseEntity<ApiError>(apiError,HttpStatus.BAD_REQUEST);
	};

}
