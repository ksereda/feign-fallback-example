package com.example.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
//@EnableHystrixDashboard
@EnableHystrix
public class ServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

}
