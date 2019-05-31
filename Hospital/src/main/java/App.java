import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			System.out.println("What would you like to do?");
			System.out.println("1. Add patient");
			System.out.println("2. View patients");
			System.out.println("3. Delete patient");
			System.out.println("4. Add employee");
			System.out.println("5. View employee");
			System.out.println("6. Delete employee");
			Integer answer = intInput();
			if (answer.equals(1)) {
				System.out.println("What is the patient's name, treatment and id?");
				new Patient(strInput(), strInput(), intInput());
				Patient.getPatientInfo();
				running = true;
			} else if (answer.equals(2)) {
				if (Patient.patients.size() == 0) {
					System.out.println("There is no patient information to display");
				} else {
					System.out.println(Patient.getPatients());
				}
				running = true;
			} else if (answer.equals(3)) {
				System.out.println("Please enter the number of the you would like to delete");
				int answer2 = (intInput());
				for (Patient patient : Patient.patients) {
					System.out.println("hello");
					if (answer2==patient.getId()) {
						patient.removePatient();
						break;
					}
				}
				running = true;
			}
			// System.out.println("What is the employee's name, Title and grade?");
			// new OccupationType(strInput(), strInput(), intInput());
			// OccupationType.getOccupationInfo();
			// System.out.println(OccupationType.getOccupationInfo());
		}

	}

	public void patientInfo() {

		Patient.getPatientInfo();
		System.out.println(Patient.getPatientInfo());
	}

	public void employeeInfo() {
		new OccupationType(strInput(), strInput(), intInput());
		OccupationType.getOccupationInfo();
		System.out.println(OccupationType.getOccupationInfo());

	}

	public static String strInput() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

	public static Integer intInput() {
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();
		return input;
	}
}
