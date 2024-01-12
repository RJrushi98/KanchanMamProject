package methods;

public class MethodWithParameter {

	public static void main(String[] args) {
		MethodWithParameter mp=new MethodWithParameter();
		mp.add(20, 10);
		mp.sub(50, 10);
		mp.mul(5, 30);
		mp.div(50, 5);
	
	}

	public void add(int x, int y)
	{
		int sum=x+y;
		System.out.println("Addition is "+sum);
	}
	public void sub(int x, int y)
	{
		int sum=x-y;
		System.out.println("Subtraction is "+sum);
	}
	public void mul(int x, int y)
	{
		int sum=x*y;
		System.out.println("Multiplication is "+sum);
	}
	public void div(int x, int y)
	{
		int sum=x/y;
		System.out.println("Division is "+sum);
	}
	
}
