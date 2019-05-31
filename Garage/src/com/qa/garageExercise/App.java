package com.qa.garageExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

		Vehicle vec1 = new Car(1, "Red", 4, 5, "VW");
		vehicleList.add(vec1);

		Vehicle vec2 = new Motorcycle(1, 1, 2, 0, "HD");
		vehicleList.add(vec2);

		Vehicle vec3 = new Motorcycle(0, 1, 2, 0, "Yamaha");
		vehicleList.add(vec3);

		Vehicle vec4 = new Van(1, 2, 4, 3, "Ford");
		vehicleList.add(vec4);

		Vehicle vec5 = new Car(0, "Blue", 4, 5, "Skoda");
		vehicleList.add(vec5);

		int i = input();
		Vehicle v = vehicleList.get(i);
			
			if (v.getClass().getSimpleName().equals("Car")) {
				Car car = (Car) v;
				car.getAux();
				car.getColour();
			} 
			else if 
				(v.getClass().getSimpleName().equals("Van")) {
					Van van = (Van) v;
					van.getFridge();
					van.getShelves();
			} else if
				(v.getClass().getSimpleName().equals("Motorcycle")) {
				Motorcycle motor = (Motorcycle) v;
				motor.getLeathers();
				motor.getHelmet();
   			}
			System.out.println(v.getClass().getSimpleName());

		}
	
	
	public static int input() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
}
}
