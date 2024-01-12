package collectionInfo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		
		v.add("Rudransh");
		v.add("chinmayi");
		v.add("Kaushal");
		v.add("Jija");
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains("Jija"));
		System.out.println(v.get(1));
		System.out.println(v.elementAt(0));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		v.insertElementAt("Om", 0);
		v.insertElementAt("Riya", 3);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);

		System.out.println("===============Traversing through vector========");
		
		//For each loop
		for(String v1:v)
		{
			System.out.println(v1);
		}
		System.out.println("========================================");
		//For loop
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("========================================");
		//Iterator
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("========================================");
		//Enumeration
		
		Enumeration<String> ele = v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		
	}

}
