package com.phonix.demo;

//Entity class | POJO : Plain Old Java Object | DTO : Data Transfer Object

public class Card {
	
	String card;
	String number;
	String cvv;

	public Card(String card, String number, String cvv) {
		this.card = card;
		this.number = number;
		this.cvv = cvv;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
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
