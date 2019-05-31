package com.qa.uniqueSum;

public class uniqueSum {

	public int addition(int num, int numTwo, int numThree) {
		int total = num + numTwo + numThree;
		if ((num != numTwo) && (num != numThree) && (numTwo != numThree)) {
			return total;
		} else if ((num != numTwo) && (num != numThree) && (numTwo == numThree)) {
			return total = num + numTwo;
		} else if ((num != numTwo) && (num == numThree) && (numTwo != numThree)) {
			return total = numTwo + num;
		} else if ((num == numTwo) && (num != numThree) && (numTwo != numThree)) {
			return total = numTwo + numThree;
		} else
			return 0;
	}
}
