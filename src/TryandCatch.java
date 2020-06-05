import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Error:Input Mismatch!");
			e.printStackTrace();
		}
	}

}
