package Concepts;
import java.io.*;
import java.util.*;
public class Serialization {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Priya");
		al.add("Priyanga");
		al.add("Saminathan");
		try {
			FileOutputStream fos=new FileOutputStream("serialization.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			FileInputStream fin=new FileInputStream("serialization.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);
			ArrayList<String> a=(ArrayList)ois.readObject();
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
