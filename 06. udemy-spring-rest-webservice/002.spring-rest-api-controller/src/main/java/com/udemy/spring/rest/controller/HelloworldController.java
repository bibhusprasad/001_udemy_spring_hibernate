package com.udemy.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloworldController {

	@GetMapping
	public String getUrl() {
		return "try : /test/hello";
	}
	
	@GetMapping("/hello")
	public String getResult() {
		return "Hi ! Hello World user";
	}
}
