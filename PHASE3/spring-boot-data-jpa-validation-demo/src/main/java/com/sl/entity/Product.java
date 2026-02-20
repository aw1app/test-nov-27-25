package com.sl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data // will add getters and setter in to the class
@NoArgsConstructor
@AllArgsConstructor
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
	float price;
	
	@NotBlank
	@Column(name="description")
	String description;	

}
