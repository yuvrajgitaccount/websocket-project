package com.codebuffer.springbootbuffersocket.model;



public class HelloMessage {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloMessage(String name) {
		super();
		this.name = name;
	}

	public HelloMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HelloMessage [name=" + name + "]";
	}
	

}
