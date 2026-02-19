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

		products.stream().forEach(prod -> System.out.println(prod));

		// Insert a new product
		Product p1 = new Product("Dell PC", 40000.0f, " High end PC ");
		productDAO.save(p1);

		System.out.println("\nAfter insertion of a new product, listing again\n");
		products = productDAO.getAllProducts();

		products.stream().forEach(prod -> System.out.println(prod));

	}
}
