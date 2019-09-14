package com.thmarket.hello;

public class HelloWorld {

	private String username;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void sayHello() {
		System.out.println("你好：" + username);
	}
}
