package Concepts;

import java.util.TreeMap;

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
public class TreeMapClassCast {
	public static void main(String args[]) {
		TreeMap<Integer,Empl> ts=new TreeMap<>();
		Empl e1=new Empl(29,"Priya");
		Empl e2=new Empl(2,"Saminathan");
		ts.put(2,e1);
		ts.put(5,e2);
		for(Empl item:ts.values()) {
			System.out.println(item.id+" "+item.name);
		}
	}
}
