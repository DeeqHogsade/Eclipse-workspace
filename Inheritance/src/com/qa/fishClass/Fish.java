package com.qa.fishClass;

import com.qa.animalClass.Animal;

public class Fish extends Animal {
	private int fins;

	public Fish(int fins, int age) {
		super(age);
		this.fins = fins;
	}

	public int getFins() {
		return fins;
	}
}
