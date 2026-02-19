package com.sl.entity;

// Entity class that maps to products table in the DB
public class Product {

	int id;
	String name;
	float price;
	String description;

	// getters and setters
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Id: " + id + " ;Name: " + name + " ;Price: " + price + " ;Description: " + description ;
	}

}
