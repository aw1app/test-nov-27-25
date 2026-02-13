package com.sl.creators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sl.Monitor;
import com.sl.Television;
import com.sl.TelevisionInfy;

@Component
public class ProductCreator {
	@Autowired
	Television tv1;

	@Autowired
	TelevisionInfy tvInfy1;

	@Autowired
	Monitor monitor1;

	public Television getTeleveison() {
		return this.tv1;
	}

	public TelevisionInfy getTeleveisonInfy() {
		return this.tvInfy1;
	}

	public Monitor getMonitor() {
		return this.monitor1;
	}

}
