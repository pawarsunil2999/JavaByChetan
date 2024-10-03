package com.phonix.demo;

//This is BUISSNESS LOGIC LAYER

public class CardVerify {

	public boolean verify( Card obj ) {
		
		DataManagment dou = new DatabaseAccess();
		boolean result = dou.checkCard(obj);
		return result;
		
	}
	
}
