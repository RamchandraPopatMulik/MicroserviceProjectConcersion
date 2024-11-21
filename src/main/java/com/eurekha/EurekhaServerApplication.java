package com.eurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaServerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekhaServerApplication.class, args);
		System.out.println("Eurekha Server is up and Working...............");
		
	}
}
