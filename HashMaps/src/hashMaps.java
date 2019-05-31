import java.util.HashMap;

public class hashMaps {

	public static void main(String[] args) {
		HashMap<String, String> myMap = new HashMap<String, String>();
		String bird = "A bird shits on cars";
		myMap.put("bird", bird);
		System.out.println(myMap.get("bird"));
	}

}
