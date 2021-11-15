package com.example.prueba.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class PruebaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaMicroserviceApplication.class, args);
	}

}
