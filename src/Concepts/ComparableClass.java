package Concepts;

import java.util.*;
import java.lang.*;

class Books implements Comparable<Books>{
	int id;
	String name;
	String author;
	Books(int id,String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public int compareTo(Books b) {
		if(id==b.id) {
			return 0;
		}
		else if(id>b.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ComparableClass {
	public static void main(String args[]) {
		ArrayList<Books> al=new ArrayList<>();
		Books b1=new Books(3,"You can win","Shiv kera");
		Books b2=new Books(6,"Think and grow rich","Nepolian hill");
		Books b3=new Books(1,"Power of your subconcious mind","Joseph");
		al.add(b1);
		al.add(b2);
		al.add(b3);
		Collections.sort(al);
		for(Books b:al) {
			System.out.println(b.id+" "+b.name+"- "+b.author);
		}
	}
}
