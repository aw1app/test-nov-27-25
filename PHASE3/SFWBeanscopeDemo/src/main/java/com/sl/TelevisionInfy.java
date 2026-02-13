package com.sl;

import org.springframework.stereotype.Component;

@Component
public class TelevisionInfy implements IProduct{
	
	String name;
	float price;
	
	public TelevisionInfy() {
	}

	public TelevisionInfy(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;

	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getProductInfo() {
		return this.name + "  TelevisionInfy " + "; Price : "+ this.price; 
	}

}