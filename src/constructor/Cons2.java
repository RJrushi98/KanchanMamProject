package constructor;

public class Cons2 {
	int x,y,z;
	//int x=100;
	//int y=200;
	public Cons2()//zero parameter constructor
	{
		x=50;
		y=30;
		z=70;
	}
	public Cons2(int a)   //single parameter constructor
	 {
		x=a;
	}
	public Cons2(int a, int b) //two parameter constructor
	{
		x=a;
		y=b;
	}
	public Cons2(int a, int b,int c) {//three parameter constructor
		x=a;
		y=b;
		z=c;
	}
	public static void main(String[] args) {
		Cons2 c2=new Cons2();
		c2.add();
		System.out.println("**************************");
		Cons2 c1=new Cons2(30);
		c1.add();
		System.out.println("**************************");
		Cons2 c3=new Cons2(60,20);
		c3.add();
		System.out.println("**************************");
		Cons2 c4=new Cons2(30,20,40);
		c4.add();
		System.out.println("**************************");
	}
	public void add() {
		int sum=x+y+z;
		System.out.println("Sum="+sum);
	}
}
