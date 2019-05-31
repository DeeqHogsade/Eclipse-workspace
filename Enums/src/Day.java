
public enum Day {
	MONDAY ("Terrible"),
	TUESDAY ("Bad"),
	WEDNESDAY ("Middle of the road"),
	THURSDAY ("Nearly there"),
	FRIDAY ("Fantastic"),
	SATURDAY ("Great"),
	SUNDAY ("Terrible again");
	
private String feeling;
	
	Day(String feeling){
		this.feeling = feeling;
	}
	
	public String getFeeling(){
		return feeling;
	}
}
