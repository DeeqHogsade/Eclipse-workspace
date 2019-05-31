package com.qa.interfaces;

public class Bees extends Animal implements Fly, See{
	public void bumble() {
		System.out.println("bzz bzz");
	}

	@Override
	public void sight() {
		System.out.println("See");
	}

	@Override
	public void eyes() {
		System.out.println("Bee eyes");	
		
	}

	@Override
	public void flap() {
		System.out.println("flap flap");
	}
}
