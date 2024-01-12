package controlStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,result;
		a=30;
		b=20;
		int c=3;
		
		switch(c)
		{
		case 1:
			result=a+b;
			System.out.println("Addition is "+result);
			break;		
		case 2:
			result=a-b;
			System.out.println("Substraction is "+result);
			break;
		case 3:
			result=a*b;
			System.out.println("Multiplication is "+result);
			break;
		case 4:
			result=a/b;
			System.out.println("Division is "+result);
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
