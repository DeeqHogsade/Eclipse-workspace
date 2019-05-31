package com.qa.Blackjack;

public class Blackjack {
	public static void main(String[] args) {
		int x = blackJack(19, 18);
		System.out.println(x);
	}

	public static int blackJack(int num, int numTwo) {
	if (num > 21 && numTwo >21) {
		return 0;
	}
	else if (num > 21 && numTwo <= 21) {
		return numTwo;
	} 
	else if (num <= 21 && numTwo > 21) {
		return num;
	}
	else if ((num <= 21 && numTwo < 21) && (num > numTwo)) {
		return num;
	}
	else if ((num <= 21 && numTwo < 21) && (num < numTwo)) {
		return numTwo;
	}
	else if (num == numTwo) {
		return num;
	}
	else
		return num;
	}
}
