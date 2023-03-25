package com.solutions.evergreen.ratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.solutions.evergreen.ratingservice" })
@EnableEurekaClient
@SpringBootApplication
public class RatingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingserviceApplication.class, args);
	}

}
