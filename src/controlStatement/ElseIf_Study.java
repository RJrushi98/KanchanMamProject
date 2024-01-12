package controlStatement;

public class ElseIf_Study {
	public static void main(String[] args) {
		
		int marks=90;
		
		if(marks>100) {
			System.out.println("Invalid Choice");
		}
		else if(marks<=100 && marks>80)
		{
			System.out.println("distinction");
		}
		else if(marks<=80 && marks>65)
		{
			System.out.println("First Class");
		}
		else if(marks<=65 && marks>=40)
		{
			System.out.println("Second Class");
		}
		else if(marks<40)
		{
			System.out.println("Fail");
		}
	}

}
