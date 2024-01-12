package loopStudy;

public class WhileStudy {

	public static void main(String[] args) {
		int x=6;
		int fact=1;
		int i=1;
		while(i<=x)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+x+" is : "+fact);

	}

}
