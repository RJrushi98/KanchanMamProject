package collectionInfo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Priya");
		ts.add("Kanchan");
		ts.add("Neha");
		ts.add("Guddi");
		
		System.out.println(ts);
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(12);
		ts1.add(23);
		ts1.add(455);
		ts1.add(45);
		ts1.add(67);
		ts1.add(56);
		
		System.out.println(ts1.ceiling(455));  //return the same or grater no than given no
		System.out.println(ts1.floor(34));    //return the same or less no than given no
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.remove(455));
		
		
		System.out.println("===============Travsering Of TreeSet============");
		System.out.println("=================Using each For Loop=================");
		
		for(Integer tss:ts1)
		{
			System.out.println(tss);
		}
		
		System.out.println("=================Iterator=================");
		Iterator<Integer> it = ts1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("=================descendingIterator=================");
		Iterator<Integer> it1 = ts1.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
