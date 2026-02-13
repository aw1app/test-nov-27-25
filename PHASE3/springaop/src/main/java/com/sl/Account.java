package com.sl;

import org.springframework.stereotype.Component;

@Component
public class Account {

	String name;
	int id;
	float balance;

	public Account() {

	}

	public Account(String name, int id, float balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	// Business
	public float deposit(float amt) {
		if (amt < 0)
			return -1f;
		else {
			this.balance += amt;
		}

		return balance;
	}

	public float withdraw(float amt) {
		if (amt < 0 || amt > this.balance)
			return -1f;
		else {
			this.balance -= amt;
		}

		return balance;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

}
