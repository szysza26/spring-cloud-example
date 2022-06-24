package com.github.szysza26.bikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikesApplication.class, args);
	}

}
