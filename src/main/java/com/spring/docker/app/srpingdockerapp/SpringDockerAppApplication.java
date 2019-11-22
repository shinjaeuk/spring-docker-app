package com.spring.docker.app.srpingdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerAppApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello World";
	}

}
