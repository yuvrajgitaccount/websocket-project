package com.codebuffer.springbootbuffersocket.model;

public class Gretting {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Gretting(String message) {
		super();
		this.message = message;
	}

	public Gretting() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gretting [message=" + message + "]";
	}
	
	

}
