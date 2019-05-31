package com.qa.interfaces;

public class Dog extends Animal implements See{
	
	public void bork() {
		System.out.println("bork bork");
	}

	@Override
	public void sight() {
		System.out.println("See");
	}

	@Override
	public void eyes() {
		System.out.println("Puppy eyes");		
	}

}
