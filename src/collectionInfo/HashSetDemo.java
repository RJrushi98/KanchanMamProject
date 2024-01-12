package collectionInfo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add("Pune");
		hs.add(23);
		hs.add(23.34);
		hs.add(null);
		hs.add("Mumbai");
		System.out.println(hs);

		System.out.println("===============Travsering Of HashSet============");
		System.out.println("=================Using each For Loop=================");
		
		for(Object hs1:hs)
		{
			System.out.println(hs1);
		}
		System.out.println("=================Using Iterator=================");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
