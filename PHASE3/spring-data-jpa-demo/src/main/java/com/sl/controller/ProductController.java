package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		List<Product> products = productRepository.findAll();

		model.addAttribute("products", products);

		return "list-products"; // WEB-INF/views/list-products.jsp
	}

	// detail a single product
	@GetMapping("/details/{id}")
	public String getAllProducts(ModelMap model, @PathVariable int id) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			model.addAttribute("product", product);
		}

		return "product"; // WEB-INF/views/product.jsp
	}

	// insert a new product

	// delete a product

	// edit and update a product

}
