package com.phonix.demo;

public class verfyCard {

	boolean verify( Card card ) {
		
		DataManagment dou = new DatabaseAccess();
		
		boolean result = dou.chechCard(card);
		return result;
	}
	
	boolean checkHistory( String number ) {
		return true;
	}
	
}
