package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.sum();
		m.sum(40, 10);
		m.sum(50, 10, 5);

	}
	
	public void sum() {
		int a,b;
		a=20;b=20;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println("Sum is "+sum);
	
	}
	
	public void sum(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum is "+sum);
	
	}

}
