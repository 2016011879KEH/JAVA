import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogCreator {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
			FileOutputStream file = new FileOutputStream("log.txt");
			file.write(format.format(date).getBytes());
			file.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(format.format(date));

	}

}
