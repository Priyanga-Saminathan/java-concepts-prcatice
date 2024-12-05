package Concepts;

import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryExample {
	public static void main(String args[]) {
		List<Integer> li=List.of(1,2,3,6,4,2,4,5,5,4,1);
		UnaryOperator<Integer> mul=number->number*10;
		System.out.println(mul.apply(21));
		List<Integer> result=li.stream().map(mul.andThen(mul)).collect(Collectors.toList());
		System.out.println(result);
		Map<Integer, Long> map=li.stream().collect(Collectors.groupingBy(num->num,Collectors.counting()));
		System.out.println(map);
		
		IntUnaryOperator intunary=num->num+10;
		System.out.println(intunary.applyAsInt(2));
		
	}
}
