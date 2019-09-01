package com.abolkog.springboot.tut;

import java.util.Date;

public class ErrorDetails {

	private String message;
	private String url;
	private Date timeStamp;

	public ErrorDetails() {

		timeStamp = new Date();
	}

	public ErrorDetails(String message, String url) {
		this();
		this.message = message;
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
