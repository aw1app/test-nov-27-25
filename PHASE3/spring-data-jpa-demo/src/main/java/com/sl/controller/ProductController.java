package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sl.entity.Product;
import com.sl.repository.ProductRepository;

@Controller
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/list")
	public String getAllProducts(ModelMap model) {
		List<Product> products =productRepository.findAll();
		
		model.addAttribute("products", products);
		
		return "list-products"; // WEB-INF/views/list-products.jsp
	} 

}
