package com.sl;

import org.springframework.stereotype.Component;


public class Television implements IProduct {

	String name;
	float price;

	public Television() {

	}

	public Television(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public String getProductInfo() {
		return this.name + "  Television " + "; Price : " + this.price;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;

	}

}
