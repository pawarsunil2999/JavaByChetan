package com.phonix.demo;

public class Card {
	
	String name;
	String number;
	String cvv;
	
	public Card(String name, String number, String cvv) {
		super();
		this.name = name;
		this.number = number;
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	 
}
