package com.vsr.jurisdiction.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vsr.jurisdiction.model.ErrorResponse;

@ControllerAdvice
public class ApiException {
	Logger log = LogManager.getLogger() ;
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ErrorResponse> HandleException(Throwable ex){
		log.info("Inside HandleException method.(ApiException)........!");
		return new ResponseEntity<>(getResponse(ex), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
 private ErrorResponse getResponse(Throwable ex) {
	 ErrorResponse response = new ErrorResponse();
	 response.setStatusCode("5XX");
	 response.setMessage(ex.getMessage());
	 log.info("Error-Message : "+ ex.getMessage());
	 response.setReason(ex.getClass().getName());
	return response;
 }
}
