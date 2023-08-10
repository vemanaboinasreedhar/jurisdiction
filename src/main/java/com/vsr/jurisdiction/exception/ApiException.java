package com.vsr.jurisdiction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vsr.jurisdiction.model.ErrorResponse;

@ControllerAdvice
public class ApiException {
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ErrorResponse> HandleException(Throwable ex){
		return new ResponseEntity<>(getResponse(ex), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
 private ErrorResponse getResponse(Throwable ex) {
	 ErrorResponse response = new ErrorResponse();
	 response.setStatusCode("5XX");
	 response.setMessage(ex.getMessage());
	 response.setReason(ex.getClass().getName());
	return response;
 }
}
