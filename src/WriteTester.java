import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTester {

	public static void main(String[] args) {
		try {
		FileOutputStream file = new FileOutputStream("text.txt");
		file.write("Hello World!".getBytes());
		file.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
