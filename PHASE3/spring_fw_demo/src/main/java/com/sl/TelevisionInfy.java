package com.sl;

public class TelevisionInfy implements IProduct{
	
	String name;
	float price;
	
	

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
	public String getProductInfo() {
		return this.name + "  TelevisionInfy " + "; Price : "+ this.price; 
	}

}