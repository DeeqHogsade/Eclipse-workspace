package com.qa.examplePolymorphism;

public class examplePolymorphism {
	public static void main (String[] args) {
		
		Cat catty1 = new Cat("ill");
		Cat catty2 = new Cat("fresh", "fatty");
		catty1.getLook();
		catty1.getName();
		catty2.getName();
		catty2.getLook();
		
	}
}
