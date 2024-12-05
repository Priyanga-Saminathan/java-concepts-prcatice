package Concepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Emp{
	String name;
	int salary;
	Emp(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return name+" "+salary;
	}
}
public class MaxStream {
	public static void main(String args[]) {
		Emp e1=new Emp("Priyanga",100000);
		Emp e2=new Emp("Pravin",120000);
		Emp e3=new Emp("Priya",200000);
		List<Emp> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		Optional<Emp> res=e.stream().min(Comparator.comparing(Emp::getSalary));
		System.out.println(res);
	}
}
