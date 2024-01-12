package inheritanceStudy;

public class Child2 extends Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c2=new Child2();
		c2.PrintA();  //Mother class method
		c2.PrintC();  //Child2 class method
		
		Child1 c=new Child1();
		c.PrintA();  //Mother class method
		c.PrintB();  //Child1 class method
	}

	public void PrintC() {
		System.out.println("This is Child2 class");
	}
}
