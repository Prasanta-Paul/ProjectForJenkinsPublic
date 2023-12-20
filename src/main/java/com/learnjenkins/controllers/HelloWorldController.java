package com.learnjenkins.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloApp")
public class HelloWorldController {

	@GetMapping("/message")
	public String messagefromApp() {
		return "I want to run from Jenkins : " + (LocalDateTime.now());
	}
	
	
}
