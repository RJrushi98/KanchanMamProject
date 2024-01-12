package collectionInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> obj=new ArrayList<>();
		
		obj.add(33);
		obj.add(21);
		obj.add(90);
		obj.add(45);
		obj.add(67);
		
		System.out.println(obj);
		
		System.out.println("************For loop**********");
		
		for(int i=0;i<=obj.size()-1;i++)
		{
			System.out.println(obj.get(i));
		}
		
		System.out.println("************For each**********");
		for( Integer a:obj)
		{
			System.out.println(a);
		}
		System.out.println("************Iterator**********");
		Iterator<Integer> it = obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("************List Iterator**********");
		ListIterator<Integer> l1 = obj.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("************List Iterator revere direction**********");
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
