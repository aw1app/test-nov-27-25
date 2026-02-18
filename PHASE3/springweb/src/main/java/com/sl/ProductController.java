package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@PostMapping("/new-product")
	@ResponseBody
	public String newProduct(@RequestParam("name") String name, @RequestParam("price") float price) {
		
		
		
		return "<V2> You submitted product " + name + " and having price " + price;
	}

	@GetMapping("/details/{id}")
	@ResponseBody
	public String getProduct(@PathVariable("id") int ID) {	
		
		
		return "<V2> You want details product with id " + ID;
	}
}
