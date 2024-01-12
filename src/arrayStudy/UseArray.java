package arrayStudy;

import java.util.Arrays;

public class UseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]={2,5,5};
	//	System.out.println(a[6]);

		int age[]= {12,3,4,5,21,6,9,10,5};
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("Reverse Order:");
		for(int i=age.length-1;i>=0;i--)
		{
			System.out.println(age[i]);
		}
		System.out.println("Ascending Order:");
		Arrays.sort(age);
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("Decending Order:");
		Arrays.sort(age);
		for(int i=age.length-1;i>=0;i--)
		{
			System.out.println(age[i]);
		}
	}

}
