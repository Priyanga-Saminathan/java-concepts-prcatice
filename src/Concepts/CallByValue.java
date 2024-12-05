package Concepts;

public class CallByValue {
	int data;
	void change(int data) {
		data=data+100;
	}
	public static void main(String args[]) {
		CallByValue c=new CallByValue();
		c.change(50);
		System.out.println(c.data);
	}
}
