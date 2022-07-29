package com.springREST.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String welcome() {//Welcome page, non-rest
		return "Rest Welcome Example.";
	}

}
