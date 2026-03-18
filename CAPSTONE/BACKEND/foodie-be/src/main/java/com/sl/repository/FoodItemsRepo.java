package com.sl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.entity.FoodItem;

public interface FoodItemsRepo extends JpaRepository<FoodItem, Integer>{

}
