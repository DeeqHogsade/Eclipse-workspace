package com.qa.calculator;

import java.util.Scanner;

public class UserInput{

	public Integer input() {
		Integer input = null;
		try (Scanner scan = new Scanner(System.in);) {
			input = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException nfe) {
			System.out.println("Not a number!");
		}
		return input;
	}

}
