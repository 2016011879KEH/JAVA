
public class ExceptionTester {

	public static void main(String[] args) {
		try {
			int a = 50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}

		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
		try {
			String s = "abc";
			int num = Integer.parseInt(s);
			System.out.println(s);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");

		}

	}

}
