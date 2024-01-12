package loopStudy;

public class DoWhileUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int i=1;
		int fact=1;
		
		do {
			fact=fact*i;
			i++;
			
		}while(i<=n);
		System.out.println("Factorial of " + n + " : " + fact);
	}

}
