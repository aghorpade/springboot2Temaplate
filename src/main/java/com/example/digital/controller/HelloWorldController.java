package com.example.digital.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private final Logger log=LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping(value="/hello")
	public String helloWorld(){
		log.warn("We are in hello world method!!");
		return "Hello World from Amit !!!";		
	}

}
