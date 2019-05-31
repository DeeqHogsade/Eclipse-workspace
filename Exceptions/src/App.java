
public class App {

	public static void main(String[] args) {
		try {
			throw new IOBrokenException();
		} catch (IOBrokenException ian) {
			System.out.println(ian.toString());
		}
	}

}
