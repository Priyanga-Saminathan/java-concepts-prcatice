package Concepts;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryExample {
	public static void main(String args[]) {
		BinaryOperator<Integer> bin=(a,b)->a+b;
		System.out.println(bin.apply(10, 20));
		
		IntBinaryOperator intbin=(a,b)->a+b;
		System.out.println(intbin.applyAsInt(20,30));
	}
}
