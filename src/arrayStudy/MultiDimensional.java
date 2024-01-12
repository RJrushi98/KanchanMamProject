package arrayStudy;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("*****************************************");
		//OR
		
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
