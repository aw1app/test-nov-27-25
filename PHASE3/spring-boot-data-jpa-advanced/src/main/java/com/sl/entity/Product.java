package com.sl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
//@Data // will add getters and setter in to the class
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	
	@Size(min = 3, max = 12, message = "product name should be between 3 and 12 chars in length")
	@Column(name="name")
	String name;
	
	@Min(value = 5, message = "Minimum price should be at least Rs. 5 ")
	@Max(value = 100000, message = "Maximum price should be at most Rs. 100000 ")
	@Column(name="price")
	Double price;
	
	
	
		
	public Product() {
		super();
	}

	public Product(int id,
			@Size(min = 3, max = 12, message = "product name should be between 3 and 12 chars in length") String name,
			@Min(value = 5, message = "Minimum price should be at least Rs. 5 ") @Max(value = 100000, message = "Maximum price should be at most Rs. 100000 ") Double price,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	@Column(name="description")
	String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	
	

}
