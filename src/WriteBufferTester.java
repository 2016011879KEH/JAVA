import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteBufferTester {

	public static void main(String[] args) {
		try {
			 FileWriter file = new FileWriter("text.txt",true);
			 PrintWriter out = new PrintWriter(file);
			 out.println("Hello!");
			 out.println("how are you?");
			 out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
