package com.persistent.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration//(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan(basePackages = {"com.persistent.*"})//basePackageClasses = {PersonController.class,PersonService.class}
public class RestApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiSpringBootApplication.class, args);
	}

}
