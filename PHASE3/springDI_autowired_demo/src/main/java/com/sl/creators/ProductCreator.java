package com.sl.creators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sl.Television;

@Component
public class ProductCreator {
	@Autowired
	Television tv1;
	
	
	public Television getTeleveison(){
		return this.tv1;
	}
	

}
