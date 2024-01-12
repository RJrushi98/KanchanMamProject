package stringClass;

public class StringUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Kanchan";
		int o=s.length();
		System.out.println("Length of String is "+o);
		System.out.println("=============================");
		
		String s1=s.toUpperCase();
		System.out.println("Uppercase String is "+s1);
		System.out.println("=============================");
		String s2=s.toLowerCase();
		System.out.println("Lowercase String is "+s2);
		System.out.println("=============================");
		char s3=s.charAt(1);
		System.out.println("index char is "+s3);
		System.out.println("=============================");
		String w="Kanchan";
		String g="";
		String x=new String("");
		System.out.println(w.isEmpty());
		System.out.println(g.isEmpty());
		System.out.println(x.isEmpty());
		System.out.println("=============================");
		
		String a="Rudransh";
		String b="";
		String c=" ";
		System.out.println(a.isBlank());
		System.out.println(b.isBlank());
		System.out.println(c.isBlank());
		System.out.println("=============================");
		
		System.out.println(a.contains("Rudr"));
		System.out.println(a.contains("a"));
		System.out.println(a.contains("z"));
		System.out.println("=============================");
		
		String a1="Kanchan";
		String a2="Kanchan";
		String a3="kanchan";
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		
		
		//Split
		String ss1="java string split method by javatpoint";  
		String[] words=ss1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(int i=0;i<=words.length-1;i++){  
		System.out.println(words[i]);  
		}  
		}
	
	

}
