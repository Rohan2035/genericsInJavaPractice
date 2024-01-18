package com.genericsPractice.util;

public class Logic<T> {
	
	private T anyObject;
	
	public Logic(T anyObject) {
		
		this.anyObject = anyObject;
		
	}
	
	public T doSomething() {
		
		return anyObject;
		
	}

}
