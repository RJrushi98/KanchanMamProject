package variablesUse;

public class StaticVariable {
	int a=90;//non static variable
	static int y=25;//static variable
	

	public static void main(String[] args) {
		//calling non static variable
		StaticVariable s=new StaticVariable();
		System.out.println("Value of a is "+s.a);
		
		//calling static variable
		System.out.println("Value of y="+y);
		
		int i;

		for(i=0;i<=10;i++)
		{
		 System.out.println("Number is "+i);

	}
	}
}
