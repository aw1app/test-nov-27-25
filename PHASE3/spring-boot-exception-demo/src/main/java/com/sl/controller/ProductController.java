package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		
		// demo exception handling
		throw new RuntimeException("Exception from inside getAllProducts method");

		//return "list-products"; // WEB-INF/views/list-products.jsp
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
	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute Product product) {
		productRepository.save(product);

		return "redirect:/products/list";
	}

	// TASK-18 delete a product
	@GetMapping("/delete-product/{id}")
	public String deleteProduct(@PathVariable int id) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			productRepository.deleteById(id);
		}

		return "redirect:/products/list";
	}

	// edit and update a product
	@GetMapping("/edit-product/{id}")
	public String editProductForm(ModelMap model, @PathVariable int id, RedirectAttributes redirectAttributes) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			model.addAttribute("product", product);
			return "edit-product"; // WEB-INF/views/edit-product.jsp
		}else {
			redirectAttributes.addFlashAttribute("productNotFoundMessage","Product not Found!");
		}

		return "redirect:/products/list";
	}
	
	
	@PostMapping("/edit-product")
	public String updateProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
		productRepository.save(product);

		redirectAttributes.addFlashAttribute("successMessage","Product updated successfully!");
		
		return "redirect:/products/list";
	}
	
	
	
	// Handle Exception
	// Generic exception
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, Model model) {
		System.out.println("INSIDE handleException");
		
		model.addAttribute("errorMessage", ex.getMessage());
		
		return "error-page";
	}
	
	// handle specific one
	@ExceptionHandler(RuntimeException.class)
	public String handleRTException(Exception ex, Model model) {
		System.out.println("INSIDE handleRTException");
		
		model.addAttribute("errorMessage", ex.getMessage());
		
		return "error-page";
	}

}
