package com.qa.garageExercise;

public class Van extends Vehicle {
	private int fridge;
	private int shelves;

	public Van(int fridge, int shelves, int wheels, int doors, String make) {
		super(wheels, doors, make);
		this.fridge = fridge;
		this.shelves = shelves;
	}

	public int getFridge() {
		return fridge;
	}

	public int getShelves() {
		return shelves;
	}
	
	@Override
	public int cost() {
		return 300;
	}

}
