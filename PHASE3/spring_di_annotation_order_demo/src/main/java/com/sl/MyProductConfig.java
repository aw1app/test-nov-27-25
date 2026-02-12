package com.sl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
public class MyProductConfig {

	@Bean
	@Order(2)
	public IProduct createIProductTelevisionInfy() {
		return new TelevisionInfy("Infy Philips II", 30000.99f);
	}

	@Bean
	@Order(1)
	public IProduct createIProductTelevision() {
		return new Television("Philips I", 30000.99f);
	}

}
