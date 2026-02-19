package com.sl;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sl.config.AppConfig;
import com.sl.dao.ProductDAO;
import com.sl.entity.Product;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDAO productDAO = context.getBean(ProductDAO.class);
		
		List<Product> products = productDAO.getAllProducts();
		
		products.stream().forEach( prod -> System.out.println(prod));
		
	}
}
