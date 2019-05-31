package com.qa.interfaces;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Bees bee1 = new Bees();
		Worm worm1 = new Worm();
		ArrayList<See> sighted = new ArrayList<See>();
		sighted.add(dog1);
		sighted.add(bee1);
		sighted.get(0).eyes();
	}

}
