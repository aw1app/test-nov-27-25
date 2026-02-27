package com.sl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig {

	@Bean
	@LoadBalanced
	@Qualifier("loadBalancedBuilder")
	public RestClient.Builder restClient() {

		return RestClient.builder();

	}

	@Bean
	@Primary // Mark this as the default if needed
	public RestClient.Builder restClientBuilder() {
		return RestClient.builder();
	}

}
