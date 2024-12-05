package Concepts;

public class TryCatch {
	public static void main(String args[]) {
		try {
			System.out.println("Try block");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
