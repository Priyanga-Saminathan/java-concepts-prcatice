package Concepts;

import java.util.TreeSet;

class Empl implements Comparable<Empl>{
	int id;
	String name;
	public Empl(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int compareTo(Empl e) {
		if(id==e.id) {
			return 0;
		}
		else if(id>=e.id) {
			return 1;
		}
		return -1;
		
	}
}
public class ClassCastException {
	public static void main(String args[]) {
		TreeSet<Empl> ts=new TreeSet<>();
		Empl e1=new Empl(29,"Priya");
		Empl e2=new Empl(2,"Saminathan");
		ts.add(e1);
		ts.add(e2);
		for(Empl item:ts) {
			System.out.println(item.id+" "+item.name);
		}
	}
}
