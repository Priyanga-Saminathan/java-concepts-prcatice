package Concepts;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		Integer arr[]=al.toArray(new Integer[al.size()]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" "+arr[i]);
		}
		
	}
}
