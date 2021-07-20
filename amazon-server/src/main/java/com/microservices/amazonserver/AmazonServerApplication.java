package com.microservices.amazonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmazonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonServerApplication.class, args);
	}

}
