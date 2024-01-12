package controlStatement;

public class NestedIfStudy {

	public static void main(String[] args) {
		int x,y,z;
		x=40;
		y=30;
		z=40;
		
		if(x==y) {
			if(x==z)
			{
				System.out.println("Numbers are same");
			}
			else {
				System.out.println("Numbers are not same");
			}			
		}
		else {
			System.out.println("=====Numbers are not same====");
		}
	}

}
