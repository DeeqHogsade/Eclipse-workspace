
public class App {
	public String goldilocks(int temp) {
		if (temp > 30) {
			return "Too Hot";
		} else if ((temp >= 10) && (temp <= 30)) {
			return "Just Right";
		} else
			return "Too Cold";

	}
}