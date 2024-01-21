package com.learnjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProjectApplication {

	public static void main(String[] args) {
		System.out.println("Starting JavaProjectApplication........");
		SpringApplication.run(JavaProjectApplication.class, args);
		System.out.println("Ending JavaProjectApplication.......");
	}

}
