package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.FoodItem;
import com.sl.repository.FoodItemsRepo;

@RestController
@RequestMapping("fooditems")
public class FoodItemController {
	
	@Autowired
	FoodItemsRepo foodItemsRepo;
	
	@GetMapping("/all")
	public List<FoodItem> list(){
		return foodItemsRepo.findAll();
	}

}
