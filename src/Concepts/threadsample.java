package Concepts;

//public class threadsample extends Thread {
//	public void run() {
//		System.out.println("Thread started");
//	}
//	public static void main(String args[]) {
//		threadsample t1=new threadsample();
//		t1.start();
////	}
////}
public class threadsample implements Runnable{
	public void run() {
		System.out.println("Thraed started");
	}
	public static void main(String args[]) {
		threadsample t1=new threadsample();
		Thread t2=new Thread(t1,"New");
		t2.start();
		System.out.println(t2.getName());
	}
}
//public class threadsample{
//	public void run() {
//		System.out.println("Thraed started");
//	}
//	public static void main(String args[]) {
//		Thread t2=new Thread("New");
//		t2.start();
//		System.out.println(t2.getName());
//	}
//}
