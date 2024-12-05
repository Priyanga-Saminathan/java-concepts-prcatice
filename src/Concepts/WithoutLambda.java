package Concepts;
interface Draw{
	public void drawing();
}
public class WithoutLambda implements Draw {
	public void drawing() {
		System.out.println("Drawing method");
	}
	public static void main(String args[]) {
		Draw d=new Draw();
//			public void drawing() {
//				System.out.println("Drawing method");
//			}
//		};
		d.drawing();
	}
}
