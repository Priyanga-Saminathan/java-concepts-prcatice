package Concepts;

import java.io.IOException;

public class CheckedExcep {
	void n() throws IOException {
//		try {
//		throw new IOException("device error");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		throw new IOException("Device error");
	}
	void m() throws IOException {
		n();
	}
	public static void main(String args[]) {
		CheckedExcep c=new CheckedExcep();
		try {
			c.m();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
