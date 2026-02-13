package com.sl;

import org.springframework.stereotype.Component;

@Component
public class FixedDeposit {
	String name;
	int id;
	float amount;
	float duration;
	float rate;
	boolean isBroken;

	public FixedDeposit() {

	}

	public FixedDeposit(String name, int id, float amount, float duration, float rate) {
		super();
		this.name = name;
		this.id = id;
		this.amount = amount;
		this.duration = duration;
		this.rate = rate;
	}

	// Business methods
	public void breakFD() {
		if (!isBroken())
			setBroken(true);
	}

	public boolean isBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
