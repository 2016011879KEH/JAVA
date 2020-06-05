import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			int num = getNum();
		}
		catch(InputMismatchException e) {
			System.out.println("Error:Input Mismatch!");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}	
	public static int getNum() throws InputMismatchException{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}
}
