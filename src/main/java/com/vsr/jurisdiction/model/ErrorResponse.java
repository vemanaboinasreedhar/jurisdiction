package com.vsr.jurisdiction.model;

import lombok.Data;

@Data
public class ErrorResponse {
	
	private String statusCode;
	private String message;
	private String Reason;

}
