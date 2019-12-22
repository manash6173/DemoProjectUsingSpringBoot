package com.manash.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manash.demo.controller","com.manash.demo.service"})
public class DempProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DempProjectApplication.class, args);
	}

}
