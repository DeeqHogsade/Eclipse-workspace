package pairProgramming;

import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing {

	public static void main(String[] args) {

		NumberGuessing n = new NumberGuessing();
	
		n.game();

	}

	public void game() {

		int max = 100;
		int min = 0;
		int range = max - min + 1;
		
		
		
		int guess = 0;
		int number = 63;

		String answer = "";
		
		boolean e = false;

		while (e == false) {
			
			int rand = (int)( Math.random() * range) + min;
			System.out.println(rand);

			if (guess == number) {
				System.out.println("number guessed");
				e = true;
			}
			System.out.println("number guessed " + rand);
			answer = input();
			if (answer.equals("lower")) {
				
				max = guess;
				
			}

			else if ( answer.equals("higher")) {
					
				min = guess;
			
			}

			

				

			}

		}



	public String input() {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		return input;

	}

}
