package com.sl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig {

	// https://jsonplaceholder.typicode.com/todos

	@Bean
	public RestClient restClient() {

		return RestClient.builder()
				.baseUrl("https://jsonplaceholder.typicode.com")
				.build();

	}

}
