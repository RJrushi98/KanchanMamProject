package polymorphism;

public class OverriddingDemo1 extends OverriddingDemo{

	public static void main(String[] args) {
		
		OverriddingDemo o1=new OverriddingDemo();
		o1.Test();
		
		OverriddingDemo1 o=new OverriddingDemo1();
		o.Test();
	}

	public void Test() {
		System.out.println("This is test method from OverriddingDemo1 class");
	}
}
