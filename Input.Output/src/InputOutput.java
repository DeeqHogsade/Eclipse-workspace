import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		BufferedReader bfdRead = new BufferedReader(new FileReader("C:/Users/Admin/Desktop/inText.txt"));
		String line = bfdRead.readLine();
		while (line != null) {
			System.out.println(line);
			line = bfdRead.readLine();

		}
		BufferedWriter bfdWriter = new BufferedWriter(new FileWriter("C:/Users/Admin/Desktop/outText.txt"));
		bfdWriter.write("\n" + "new line" + "\r\n");
		bfdWriter.write("yay!" + "\n");
		bfdWriter.flush();
		bfdWriter.close();
	}

}
