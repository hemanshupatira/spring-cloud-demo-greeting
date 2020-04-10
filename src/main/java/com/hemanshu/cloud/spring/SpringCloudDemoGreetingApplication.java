package com.hemanshu.cloud.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoGreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoGreetingApplication.class, args);
	}

}
