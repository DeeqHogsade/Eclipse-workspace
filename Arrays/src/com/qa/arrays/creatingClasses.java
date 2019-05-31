package com.qa.arrays;

public class creatingClasses {

	public static void main(String[] args) {

		creatingClasses creatingClassesy = new creatingClasses();
		creatingClassesy.inputStuff();
	}

	public void inputStuff() {
		Task myItem = new Task("Milk", "Cow", 1);
		System.out.println(myItem.item);
		System.out.println(myItem.where);
		System.out.println(myItem.daysLeft);

	}

}
