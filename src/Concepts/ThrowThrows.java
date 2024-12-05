package Concepts;

public class ThrowThrows {
	public void run(int n){
		if(n<1) {
			throw new ArithmeticException("Number is negative");
		}
	}
	public static void main(String args[]) {
		ThrowThrows t=new ThrowThrows();
		try {
		t.run(-3);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
