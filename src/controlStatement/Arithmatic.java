package controlStatement;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		
		System.out.println("Enter the two values:");
		Scanner obj=new Scanner(System.in);
		
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		//double x=obj.nextDouble();
		
		int result=a+b;

		System.out.println("sum="+result);

	}

}
