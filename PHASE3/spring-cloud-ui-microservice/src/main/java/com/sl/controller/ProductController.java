package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;

import com.sl.entity.Product;

@Controller
@RequestMapping("products")
public class ProductController {

	RestClient restClientProduct; // http://spring-cloud-product-microservice
	
	public ProductController(@Qualifier("loadBalancedBuilder") RestClient.Builder builder) {
		this.restClientProduct= builder.baseUrl("http://spring-cloud-product-microservice").build();
	}
	
	@GetMapping("/list") 
	public String getAllproducts(Model model) {
		List<Product> products = restClientProduct.get().uri("/products/list").retrieve()
				.body(new ParameterizedTypeReference<List<Product>>() {} );

		model.addAttribute("products", products);

		return "products"; // WEB-INF/views/products.jsp
	}
}
