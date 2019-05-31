import java.util.Scanner;

public class numbersExercise {
	boolean run = true;
	int answer = input();
	int int1 = 0;
	int int2 = 0;
	String result = Integer.toString(answer);
	String[] splitter = result.split("");
	String split0 = splitter[0];
	String split1 = splitter[1];

	public Integer input() {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}

	public int userInput() {

		if (answer > 9 && answer < 100) {

			while (run) {
				int1 = Integer.parseInt(split0);
				int2 = Integer.parseInt(split1);
				run = false;
			}
		}
		System.out.println("The sum of your chosen numbers are: " + (int1 + int2));
		return int1 + int2;

		// System.out.println("Please enter a number between 1-100");
		// int answer = input();
		// if ((answer < 100) && (answer > 9)) {
		// String answerS = String.valueOf(answer);
		// char answerSC = answerS.charAt(0);
		// char answerSC2 = answerS.charAt(1);
		// if (answerSC = 1) {
		// result = "teen"
		//
		// }
		// } else
		// System.out.println("Please try again");
		//
		// return answer;

		// Integer.parseInt(answer());
		// String s=String.valueOf(i)
		// Integer.parseInt(text.answer()

	}

	public int numbersText() {
		if (answer < 10) {
			System.out.println("please enter a number greater than 10");
		}
	}
}
