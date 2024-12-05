package Concepts;

public class Throws {
	void n() {
		throw new NullPointerException("Null Pointer Exception");
	}
	void m() {
		try {
		n();
		}
		catch(Exception e) {
			System.out.println("Exception:   "+e);
		}
	}
	public static void main(String args[]) {
		Throws t=new Throws();
		try {
			t.m();
		}
		catch(NullPointerException e) {
			System.out.println("Null"+e);
		}
		System.out.println("Rest of the code");
	}
}
