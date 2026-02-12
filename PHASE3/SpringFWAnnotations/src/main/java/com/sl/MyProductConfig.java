package com.sl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyProductConfig {

	@Bean
	public IProduct createTelevision() {
		return new Television("Philips", 20000.99f);
	}

}
