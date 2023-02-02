package com.springboot.app.SpringBootdemoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}

// Spring MUC internally uses jacson library and message convertor to convert java object into JSON.
//@ResponseBody annotation uses HTTP message converters to convert the reurn value (java object) to HTTP response body (for example: JSON), based on the content-type in the request HTTP header.
