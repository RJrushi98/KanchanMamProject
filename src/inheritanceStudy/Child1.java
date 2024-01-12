package inheritanceStudy;

public class Child1 extends Mother{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		c.PrintA();  //Mother class method
		c.PrintB();  //Child1 class method
		
		Child2 c2=new Child2();
		c2.PrintA();  //Mother class method
		c2.PrintC();  //Child2 class method
	}

	public void PrintB() {
		System.out.println("This is child1 class");
	}
}
