package com.test;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorld {
	
	@GetMapping("/")
	public String getIndex() {
		return "home";
	}
	
	//simple Hello World response..
	public String getHelloWorld() {
		return "Hello World!";
	}
}
