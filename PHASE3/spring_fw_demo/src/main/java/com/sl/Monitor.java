package com.sl;

public class Monitor implements IProduct{
	
	String name;
	float price;
	
	

	public Monitor(String name, float price) {
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
		return this.name + "  Monitor " + "; Price : "+ this.price; 
	}

}