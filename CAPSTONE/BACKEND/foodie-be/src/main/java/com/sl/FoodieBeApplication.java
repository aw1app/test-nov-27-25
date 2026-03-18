package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.sl")

@SpringBootApplication
public class FoodieBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieBeApplication.class, args);
	}

}
