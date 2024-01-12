package arrayStudy;
import java.util.Arrays;
public class ArrayStudy {

	public static void main(String[] args) {
		char[] albhabet= {'s','e','k','r','a','z','m'};
		
		System.out.println("Print Original Character");
		for(int i=0;i<albhabet.length;i++)
		{
			System.out.println(albhabet[i]);
		}
		System.out.println("Print Reverse Character");
		for(int i=albhabet.length-1;i>=0;i--)
		{
			System.out.println(albhabet[i]);
		}
		System.out.println("Print Ascending order Character");
		Arrays.sort(albhabet);
		for(int i=0;i<albhabet.length;i++)
		{
			System.out.println(albhabet[i]);
		}
		System.out.println("Print Descending  order Character");
		Arrays.sort(albhabet);
		for(int i=albhabet.length-1;i>=0;i--)
		{
			System.out.println(albhabet[i]);
		}
	}

}
