package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sl.entity.Product;
import com.sl.exception.ProductNotFoundException;
import com.sl.repository.ProductRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("products")
public class ProductController {

	private final AboutController aboutController;

	@Autowired
	ProductRepository productRepository;

	ProductController(AboutController aboutController) {
		this.aboutController = aboutController;
	}

	@GetMapping("/list")
	public String getAllProducts(ModelMap model) {
		List<Product> products = productRepository.findAll();

		model.addAttribute("products", products);

		// demo exception handling
		// throw new RuntimeException("Exception from inside getAllProducts method");

		return "list-products"; // WEB-INF/views/list-products.jsp
	}

	// detail a single product
	@GetMapping("/details/{id}")
	public String getAllProducts(ModelMap model, @PathVariable int id) throws ProductNotFoundException {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			model.addAttribute("product", product);
		} else {
			// if the product was found from DB throw ProductNotFoundExcption
			throw new ProductNotFoundException("Product with id=" + id + " not found ");
		}

		return "product"; // WEB-INF/views/product.jsp
	}

	// Add a new product
	// Method to show the form initially
	@GetMapping("/add-product")
	public String showForm(Model model) {
		model.addAttribute("product", new Product()); // Give the form an object to bind to
		return "add-product"; // The name of your JSP
	}

	@PostMapping("/add-product")
	public String addProduct(@Valid @ModelAttribute Product product, BindingResult result,
			RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println("VALIDATION ERROR MESSAGE " + error.getDefaultMessage());
				redirectAttributes.addFlashAttribute("productValidationMessage", error.getDefaultMessage());
			}

			result.getFieldErrors().forEach(
					f -> System.out.println("Field: " + f.getField() + " Rejected Value: " + f.getRejectedValue()));

			return "redirect:/products/add-product"; // return to form page
		}

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

	// Task-17 : Add validation your edit product as well just like we did for add
	// product

	// edit and update a product
	@GetMapping("/edit-product/{id}")
	public String editProductForm(ModelMap model, @PathVariable int id, RedirectAttributes redirectAttributes) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			model.addAttribute("product", product);
			return "edit-product"; // WEB-INF/views/edit-product.jsp
		} else {
			redirectAttributes.addFlashAttribute("productNotFoundMessage", "Product not Found!");
		}

		return "redirect:/products/list";
	}

	@PostMapping("/edit-product")
	public String updateProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
		productRepository.save(product);

		redirectAttributes.addFlashAttribute("successMessage", "Product updated successfully!");

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

	// one more specific one
	@ExceptionHandler(ProductNotFoundException.class)
	public String handleProductNotFoundException(Exception ex, Model model) {
		System.out.println("INSIDE handleProductNotFoundException");

		model.addAttribute("errorMessage", ex.getMessage());

		return "product-not-found-exception-page";
	}

	// ADVANCED JPA
	// detail a single product by it's name
	@GetMapping("/details/byname")
	public String getProductByName(ModelMap model, @RequestParam String name) throws ProductNotFoundException {
		Optional<Product> optionalProduct = productRepository.findByName(name);

		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			model.addAttribute("product", product);
		} else {
			// if the product was found from DB throw ProductNotFoundExcption
			throw new ProductNotFoundException("Product with name=" + name + " not found ");
		}

		return "product"; // WEB-INF/views/product.jsp
	}

	// All products that have partial name match
	@GetMapping("/list/byname")
	public String getAllProductsNameContains(ModelMap model, @RequestParam String name) {
		List<Product> products = productRepository.findAllByNameContaining(name);

		model.addAttribute("products", products);

		// demo exception handling
		// throw new RuntimeException("Exception from inside getAllProducts method");

		return "list-products"; // WEB-INF/views/list-products.jsp
	}

	// All products that have price range match
	@GetMapping("/list/byprice")
	public String getAllProductsPriceRange(ModelMap model, @RequestParam float price1, @RequestParam float price2) {
		List<Product> products = productRepository.findAllByPriceBetween(price1, price2);

		model.addAttribute("products", products);

		// demo exception handling
		// throw new RuntimeException("Exception from inside getAllProducts method");

		return "list-products"; // WEB-INF/views/list-products.jsp
	}

	// All products that have price range match
	@GetMapping("/list/bynamelength")
	public String getAllProductsPriceRange(ModelMap model, @RequestParam int nameLength) {
		List<Product> products = productRepository.findProductsWithNameLength(nameLength);

		model.addAttribute("products", products);

		// demo exception handling
		// throw new RuntimeException("Exception from inside getAllProducts method");

		return "list-products"; // WEB-INF/views/list-products.jsp
	}

}
