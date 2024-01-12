package collectionInfo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Object> ls=new LinkedHashSet<Object>();
		
		ls.add("Rudra");
		ls.add(01);
		ls.add("Kanchan");
		ls.add(0.32);
		ls.add("akshay");
		
		System.out.println(ls);

		System.out.println("===============Travsering Of LinkedHashSet============");
		System.out.println("=================Using each For Loop=================");
		
		for(Object ls1:ls)
		{
			System.out.println(ls1);
		}
		
		System.out.println("=================Using Iterator=================");
		
		Iterator<Object> it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
