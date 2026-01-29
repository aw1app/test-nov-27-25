package com.sl.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

// sample usage of this tag:
//<product name="T shirt" price="450.5" />
public class ProductTag extends SimpleTagSupport {

	private String name;
	private double price;

	// setters are mandatory
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.print("Product Name: <span style='color:red;font-weight:bold;'>" + name + " </span> Price: " + price);
	}

}
