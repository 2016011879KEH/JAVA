import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTester {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		try {
			FileInputStream file = new FileInputStream("no.txt");
			file.read(b);
			System.out.println(new String(b));
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not found!");
//			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		}
	}
}
