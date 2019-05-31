import java.util.Scanner;

public class Cage<T extends Animal> {
	private T myItem;

	public static void main(String[] args) {
		Cage<Animal> myCage = new Cage<Animal>();
		myCage.setMyItem("Hello");
		System.out.println(myCage.getMyItem());
	}

	public int getMyItem() {
		return this.myItem.age;
	}

	public void setMyItem(T input) {
		this.myItem = input;
	}

	
}
