package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String args[]) {
		Supplier<Integer> randomNumber=()->(int)(Math.random()*100);
		List<Integer> al=Stream.generate(randomNumber).limit(5).collect(Collectors.toList());
		System.out.println(al);
	}
}
