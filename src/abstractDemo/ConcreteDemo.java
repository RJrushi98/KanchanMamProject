package abstractDemo;

public class ConcreteDemo extends Demo {
	public static void main(String[] args) {
		
		ConcreteDemo c=new  ConcreteDemo();
		c.demo1();
		c.demo2();
		c.demo3();
		c.demo4();
		c.demo5();
		
	}
		@Override
	public void demo3() {
		System.out.println("This is demo3 method from Demo class");
		
	}

	@Override
	public void demo4() {
		// TODO Auto-generated method stub
		System.out.println("This is demo4 method from Demo class");
	}
	
	public void demo5() {
		System.out.println("This is demo5 method from ConcreteDemo class");
	}

}
