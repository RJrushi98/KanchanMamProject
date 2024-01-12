package arrayStudy;

public class MockPractice {

	public static void main(String[] args) {
		//{1,1,11,22,225,33,44,55,55,,77,88}
	//	print duplicate number
		
		int a[]={1,1,11,22,225,33,44,55,55,77,88};
		
		  for(int i = 0; i < a.length; i++) 
		  {  
	            for(int j = i + 1; j < a.length; j++) 
	            {  
	                if(a[i] == a[j])  
	                    System.out.println(a[j]);  
	            }
		  }

}
}