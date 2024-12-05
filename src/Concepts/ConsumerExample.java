package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees{
	String name;
	int age;
	String city;
	Employees(String name,int age, String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	String getCity() {
		return city;
	}
	String getName() {
		return name;
	}
}

public class ConsumerExample {
	public static void main(String args[]) {
		Employees e1=new Employees("Priya",23,"Chennai");
		Employees e2=new Employees("Pravin",15,"Chennai");
		Employees e3=new Employees("Priyanga",40,"Mumbai");
		List<Employees> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Consumer<Employees> printName=employee->System.out.print(employee.getName()+" -");
		Consumer<Employees> printCity=employee->System.out.println(employee.getCity());
		al.stream().forEach(printName.andThen(printCity));
	}
}
