package com.example.demo.model;

import java.time.LocalDateTime;

public class ErrorMessage {
	
	
	private LocalDateTime timestamp;
	
	private int status;
	
	private String message;
	
	private String path;
	
	
	

	public ErrorMessage(LocalDateTime localDateTime, String message, String path,int status) {
		super();
		this.timestamp = localDateTime;
		this.message = message;
		this.path = path;
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
