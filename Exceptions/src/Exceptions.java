
public class Exceptions {

	public static void main(String[] args) {
		Exceptions app = new Exceptions();
		app.method1();
	}
	public void method1() {
		method2();
	}
	public void method2() throwsIOException{
		
	}
}
