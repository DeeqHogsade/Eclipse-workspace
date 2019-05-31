package com.qa.garageExercise;

public class Car extends Vehicle {
	private int aux;
	private String colour;

	public Car(int aux, String colour, int wheels, int doors, String make) {
		super(wheels, doors, make);
		this.aux = aux;
		this.colour = colour;
	}

	public int getAux() {
		return aux;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public int cost() {
		return 100;
	}

}
