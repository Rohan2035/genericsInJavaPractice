package com.genericsPractice;

import com.genericsPractice.util.Logic;

public class Main {
	
	public static void main(String[] args) {
		
		Integer myInteger = Integer.valueOf(24);
		String myString = "Star Platinum";
		
		// I'm using String type here
		Logic<String> myLogicOne = new Logic<>(myString);
		System.out.println("Generics using String: " + myLogicOne.doSomething());
		
		// I'm using Integer here
		Logic<Integer> myLogicTwo = new Logic<>(myInteger);
		System.out.println("Generics using Integer: " + myLogicTwo.doSomething());
		
	}

}
