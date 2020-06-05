import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample2 {

	public static void main(String[] args) {
		try {
			int num = getNum();
		}
		catch(MyException e) {
			System.out.println("MyException");
		}
		catch(InputMismatchException e) {
			System.out.println("Error:Input Mismatch!");
			e.printStackTrace();
		}
		finally {
			System.out.println("End!");
		}
	}	
	public static int getNum() throws InputMismatchException, MyException{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num %2 !=0) {
			throw new MyException();
		}
		return num;
	}

}
