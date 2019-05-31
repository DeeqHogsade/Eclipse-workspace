import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	private String name;
	private String treatment;
	private int id;
	static ArrayList<Patient> patients = new ArrayList<Patient>();

	public Patient(String name, String treatment, int id) {
		this.id = id;
		this.name = name;
		this.treatment = treatment;
		Patient.patients.add(this);
	}

	public String getName() {
		return name;
	}

	public String getTreatment() {
		return treatment;
	}
	public Integer getId() {
		return id;
	}

	public static ArrayList<Patient> getPatients() {
		return patients;
	}

	@Override
	public String toString() {
		return "Patient [Name = " + name + ", Treatment = " + treatment + "]" + ", ID = " + id + "\r\n";
	}

	public static String getPatientInfo() {
		String info = "";
		for (Patient patient : patients) {
			info += patient.toString();
		}
		return info;
	}
	public void addPatient() {
		System.out.println("What is the patient's name, treatment and ID?");
		new Patient(strInput(), strInput(), intInput());
		System.out.println(OccupationType.getOccupationInfo());
	
	}
	
	public Integer removePatient() {
		patients.remove(this);
		return null;
	}
	public String strInput() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	public Integer intInput() {
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();
		return input;
	}

}
