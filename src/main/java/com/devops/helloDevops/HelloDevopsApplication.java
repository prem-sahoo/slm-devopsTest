package com.devops.helloDevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.devops.controller")
public class HelloDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDevopsApplication.class, args);
	}

}
