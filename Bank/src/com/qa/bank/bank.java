package com.qa.bank;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bank {
	static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public int intInput() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public Float floatInput() {
		Scanner s = new Scanner(System.in);
		Float input = s.nextFloat();
		return input;
	}
	public void operation() {
	
	int command = 0; 
	boolean run = true;
	while (run) {
	System.out.println("What would you like to do?");
	System.out.println("1. Add account");
	System.out.println("2. Show accounts");
	System.out.println("3. Delete account");
	command = intInput();
	if (command == 1) {
		System.out.println("What is the account name?");
		String userInput2 = input();
		System.out.println("What is the account balance?");
		float newBalance = floatInput();		
		accounts.add(new BankAccount(userInput2, newBalance));
	} else if (command == 2) {
		System.out.println("What is the account name?");
		String userInput = input();
		for (BankAccount account: accounts) {
			if (account.name.equals(userInput)){
				System.out.println(account.name);
				System.out.println(account.balance);
			}
		}
	} else if (command == 3) {
		System.out.println("Which account would you like to delete?");
		String userInput = input();
		for (BankAccount account: accounts) {
			if (account.name.equals(userInput)){
				accounts.remove(account);
				break;
			} else {
				System.out.println("There is no account by that name. Please try again");
			}
		}
		
	} else
		System.out.println("Please try again");
	}
	}
}
