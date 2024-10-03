package com.phonix.demo;

//This is BUISSNESS LOGIC LAYER

public class CardVerify {

	public boolean verify( Card obj ) {
		
		DataManagment dou = new DatabaseAccess();
		boolean result = dou.checkCard(obj);
		System.out.println("This is the Card verify");
		return result;
		
	}

	public boolean checkHistory(String number) {
		System.out.println("This is the Card history");
		return true;
	}
	
}
