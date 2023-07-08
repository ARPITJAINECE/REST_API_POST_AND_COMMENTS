package com.app.dto;

public class ApiResponse {
	private String message;

	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}

	public ApiResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResponse [message=" + message + "]";
	}

}
