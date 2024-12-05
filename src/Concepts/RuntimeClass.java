package Concepts;

public class RuntimeClass{
//	public void run() {
//		System.out.println("Thread running");
//	}
	public static void main(String args[]) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
//		Thread t1=new Thread("New");
//		r.addShutdownHook(t1);
//		t1.start();
//		System.out.println(t1.getName());
	}
}
