package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.Product;
import com.sl.repository.ProductRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/list")
	public List<Product> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}
	
	
	@GetMapping("/details/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		Optional<Product> product = productRepository.findById(id);
		return product;
	}
	
	// create a new product
	@PostMapping("/add-product")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println("VALIDATION ERROR MESSAGE " + error.getDefaultMessage());
			}

			result.getFieldErrors().forEach(
					f -> System.out.println("Field: " + f.getField() + " Rejected Value: " + f.getRejectedValue()));

			return null;
		}

		Product savedProduct = productRepository.save(product);

		return new ResponseEntity(savedProduct, HttpStatus.CREATED );
	}

}
