import java.util.Optional;

public class App {

	public static void main(String[] args) {
		String x = "valid";
		Optional<String> myOptional = Optional.ofNullable(x);
		System.out.println(myOptional.orElse("not valid"));
	}

}
