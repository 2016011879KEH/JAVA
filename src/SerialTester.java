import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialTester {

	public static void main(String[] args) {
		Demo object = new Demo("Hello");
		String fileName = "rec.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
