package Concepts;

public class Deadlock {
	public static void main(String args[]) {
		String str1="Priyanga";
		String str2="Saminathan";
		Thread t1=new Thread() {
			public void run() {
				synchronized(str1) {
					System.out.println("Thread 1 locked "+str1);
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str2) {
						System.out.println("Thread 1 locked "+str2);
					}
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized(str2) {
					System.out.println("Thread 2 locked "+str2);
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str1) {
						System.out.println("Thread 2 locked "+str1);
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
