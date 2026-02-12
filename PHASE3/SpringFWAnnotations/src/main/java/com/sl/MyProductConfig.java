package com.sl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
public class MyProductConfig {

	@Bean(name="i1")
//	@Order(value = 2)
	public IProduct createIProductTelevisionInfy() {
		return new TelevisionInfy("Infy Philips II", 30000.99f);
	}
	
	@Bean
	@Primary
//	@Order(value = 2)
	public IProduct createIProductTelevision() {
		return new Television("Philips II", 30000.99f);
	}
	
	@Bean(name="i2")
//	@Order(value = 1)
	public TelevisionInfy createTelevisionInfy() {
		return new TelevisionInfy("Philips I", 25000.99f);
	}	
	
	@Bean
	
	public Television createTelevision() {
		return new Television("Philips", 20000.99f);
	}
	
	

	@Bean
	public Monitor createMonitor() {
		return new Monitor("HP", 12000.99f);
	}
}
