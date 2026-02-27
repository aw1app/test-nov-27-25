package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudUiMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUiMicroserviceApplication.class, args);
	}

}
