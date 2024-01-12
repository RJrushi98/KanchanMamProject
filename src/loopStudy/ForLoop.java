package loopStudy;

public class ForLoop {

public static void main(String[] args) {
	String a="Hello";//5
	String b="";



	for(int i=a.length()-1;i>=0;i--)
	{    
		b=b+a.charAt(i);
	}
	System.out.println("String is "+a);

	System.out.println("Reverse String is "+b);
	}
}
		

