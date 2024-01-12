package ThisAndSuper;

public class SuperDemo extends ThisDemo {
	
	int a=50;

	public static void main(String[] args) {
		SuperDemo s=new SuperDemo();
		s.B();
	}
	
	public void B() {
		int a=60;
		
		int sum=a+20;
		System.out.println("Print Result "+sum);  //for local variable
		
		sum=super.a+20;
		System.out.println("Print Result "+sum);   //for super variable from superclass
		
	}
}
