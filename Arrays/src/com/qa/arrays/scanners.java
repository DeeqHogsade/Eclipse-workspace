package com.qa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class scanners {

	public static void main(String[] args) {
		scanners scannersy = new scanners();
		scannersy.sList();

	}

	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

	public void sList() {
		ArrayList<String> sList = new ArrayList<String>();
		boolean True = true;

		while (True) {
			System.out.println("What would you like to do?");
			String answer = input();
			if (answer.equals("add") || answer.equals("Add")) {
				System.out.println("What would you like to add?");
				answer = input();
				sList.add(answer);
				System.out.println();
				True = true;
				
			} else if (answer.equals("show") || answer.equals("Show")) {
				if (sList.size() == 0) {
					System.out.println("List is empty");
				} else {
					System.out.println(sList);
				}
				True = true;
			} else if (answer.equals("delete") || answer.equals("Delete")) {
				System.out.println("What would you like to delete" + sList);
				answer = sList.get(Integer.parseInt(input())-1);
				sList.remove(answer);
				True = true;
			} else if (answer.equals("exit") || answer.equals("Exit")) {
				True = false;
			} else {
				System.out.println("Please try again");
				True = true;
			}

		}
	}
}
