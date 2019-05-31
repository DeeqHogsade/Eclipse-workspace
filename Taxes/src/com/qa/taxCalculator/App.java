package com.qa.taxCalculator;

public class App {

	public static void main(String[] args) {
		taxCalculator taxCalc = new taxCalculator();
		taxCalc.taxAmount();
		System.out.println("The rate you will be taxed at is " + taxCalc.rate);
		System.out.println("The amount you will be taxed is " + taxCalc.tax);
		
	}

}
