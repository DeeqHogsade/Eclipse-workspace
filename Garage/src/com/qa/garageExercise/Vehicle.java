package com.qa.garageExercise;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Vehicle {
	private int wheels;
	private int doors;
	private String make;

	public Vehicle(int wheels, int doors, String make) {
		this.wheels = wheels;
		this.doors = doors;
		this.make = make;
	}

	public int getWheels() {
		return wheels;
	}

	public int getDoors() {
		return doors;
	}

	public String getMake() {
		return make;
	}

	abstract public int cost();
}