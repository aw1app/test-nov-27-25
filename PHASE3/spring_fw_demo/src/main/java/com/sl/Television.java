package com.sl;

public class Television implements IProduct{
	
	String name;
	float price;
	
	

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
		return this.name + "  Television " + "; Price : "+ this.price; 
	}

}
