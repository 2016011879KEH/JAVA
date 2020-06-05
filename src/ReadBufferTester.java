import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBufferTester {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("text.txt");
			BufferedReader in = new BufferedReader(file);
			String str; 
			do {
				str = in.readLine();
				if(str != null)
				System.out.println(str);
			} while(str != null);	
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
