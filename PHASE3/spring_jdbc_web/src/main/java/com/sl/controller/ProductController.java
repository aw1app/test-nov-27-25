package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sl.dao.ProductDAO;
import com.sl.entity.Product;

@Controller
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductDAO productDAO;
	
	
	@GetMapping("/list")
	public String listAllProducts(ModelMap model) {
		List<Product> products = productDAO.getAllProducts();
		
		model.addAttribute("products", products);
		
		return "list-products"; // WEB-INF/views/list-products.jsp
		
	}

}
