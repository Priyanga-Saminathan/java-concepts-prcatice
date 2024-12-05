package Concepts;
import java.util.Map;
import java.util.TreeMap;
class Emp{
	int id;
	String name;
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class TreeMap {
	public static void main(String args[]) {
		Map<Integer,Emp> t=new TreeMap<>();
		Emp e1=new Emp(1,"Priya");
		Emp e2=new Emp(2,"Saminathan");
		t.put(10,e1);
		t.put(20,e2);
		for(Map.Entry m:t.entrySet()) {
			System.out.println(t.getKey());
		}
	}
}
