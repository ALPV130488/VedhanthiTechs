package com.vt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemoonAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoonAwsApplication.class, args);
	}
	
	
	@RequestMapping("/message")				//http://localhost:5050/message
	public String displayMessage() {
		
		return "Hi welcome aws demo example";
	}

}
