package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
	String name;
	int age;
	String city;
	Employee(String name,int age, String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	String getCity() {
		return city;
	}
	int getAge() {
		return age;
	}
}
public class PredicateExample {
	public static void main(String args[]) {
		Employee e1=new Employee("Priya",23,"Chennai");
		Employee e2=new Employee("Pravin",15,"Chennai");
		Employee e3=new Employee("Priyanga",40,"Mumbai");
		List<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Predicate<Employee> isCityChennai=emp->emp.getCity().equals("Chennai");
		Predicate<Employee> isValidAge=emp->emp.getAge()>=18;
		List<Employee> filter=al.stream().filter(isCityChennai.and(isValidAge)).collect(Collectors.toList());
		System.out.println(filter);
		for(Employee emp:filter) {
			System.out.println(emp.name+" "+emp.city+" "+emp.age);
		}
	}
}
