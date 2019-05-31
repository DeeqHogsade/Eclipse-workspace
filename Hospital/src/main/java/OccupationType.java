import java.util.ArrayList;
import java.util.Scanner;

public class OccupationType {
	private String name;
	private String title;
	private int intGrade;
	static ArrayList<OccupationType> occupations = new ArrayList<OccupationType>();

	public OccupationType(String name, String title, int intGrade) {
		this.name = name;
		this.title = title;
		this.intGrade = intGrade;
		OccupationType.occupations.add(this);
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}
	
	public Integer getGrade() {
		return intGrade;
	}

	public static ArrayList<OccupationType> getOccupations() {
		return occupations;
	}

	@Override
	public String toString() {
		return "Employee [Name = " + name + ", Title = " + title + ", Grade = " + intGrade + "]" + "\r\n";
	}

	public static String getOccupationInfo() {
		String info = "";
		for (OccupationType occupations : occupations) {
			info += occupations.toString();
		}
		return info;
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
