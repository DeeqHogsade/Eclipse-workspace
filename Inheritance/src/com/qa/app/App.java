package com.qa.app;

import com.qa.animalClass.Animal;
import com.qa.fishClass.Fish;
import com.qa.monkeyClass.Monkey;
public class App {
	public static void main(String[] args) {
		Fish fish = new Fish(3,6);
		System.out.println(fish.getAge());
		System.out.println(fish.getFins());

	}
}