package com.example.demo;

public class HelloResponse {
	
	private String message;
	private DetailResponse detail = new DetailResponse();

	public HelloResponse() {
	}

	public HelloResponse(String message) {
		this.message = message;
	}
	
	public DetailResponse getDetail() {
		return detail;
	}

	public void setDetail(DetailResponse detail) {
		this.detail = detail;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
