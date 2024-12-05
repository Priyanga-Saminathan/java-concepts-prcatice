package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionExample {
	public static void main(String args[]) {
		Employees e1=new Employees("Priya",23,"Chennai");
		Employees e2=new Employees("Pravin",15,"Chennai");
		Employees e3=new Employees("Priyanga",40,"Mumbai");
		List<Employees> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Function<Employees,String> fun=employee->employee.getCity();
		List<String> li=al.stream().map(fun).collect(Collectors.toList());
		System.out.println(li);
	}
}
