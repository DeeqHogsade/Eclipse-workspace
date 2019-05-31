package com.qa.garageExercise;

public class Motorcycle extends Vehicle{
	private int Leathers;
	private int helmet;
	
	public Motorcycle(int Leathers, int helmet, int wheels, int doors, String make) {
		super(wheels, doors, make);
		this.Leathers = Leathers;
		this.helmet = helmet;
	}
	
	public int getLeathers() {
		return Leathers;
	}
	public int getHelmet() {
		return helmet;
	}
	
	@Override
	public int cost() {
		return 200;
	}


}
