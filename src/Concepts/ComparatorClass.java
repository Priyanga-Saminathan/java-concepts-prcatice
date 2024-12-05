package Concepts;
import java.util.*;
class Book{
	int id;
	String name;
	String author;
	public Book(int id,String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
}
class IdComparator implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		if(b1.id==b2.id) {
			return 0;
		}
		else if(b1.id>b2.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
class NameComparator implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		return b1.name.compareTo(b2.name);
//		if(b1.name==b2.name) {
//			return 0;
//		}
//		else if(b1.name>b2.name) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
	}
}
public class ComparatorClass {
	public static void main(String args[]) {
		ArrayList<Book> al=new ArrayList<>();
		Book b1=new Book(3,"You can win","Shev kera");
		Book b2=new Book(6,"Think and grow rich","Nepolian hill");
		Book b3=new Book(1,"Power of your subconcious mind","Joseph");
		al.add(b1);
		al.add(b2);
		al.add(b3);
		Collections.sort(al,new IdComparator());
		for(Book b:al) {
			System.out.println(b.id+" "+b.name+"- "+b.author);
		}
		Collections.sort(al,new NameComparator());
		for(Book b:al) {
			System.out.println(b.id+" "+b.name+"- "+b.author);
		}
	}
}
