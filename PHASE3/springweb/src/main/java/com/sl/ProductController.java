package com.sl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("products")
public class ProductController {

	@PostMapping("/new-product")
	@ResponseBody
	public String newProduct(@RequestParam("name") String name, @RequestParam("price") float price) {

		return "<V2> You submitted product " + name + " and having price " + price;
	}

	@GetMapping("/details/{id}")
	public String getProduct(ModelMap model, @PathVariable int id) {
		
		Map<String, Object> product = Map.of(
                "name", "Laptop",
                "price", 50000
        );

        model.addAttribute("product", product);

		return "product";
	}

	
}
