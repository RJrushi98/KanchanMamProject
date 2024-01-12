package collectionInfo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(23);
		pq.add(56);
		pq.add(34);
		pq.add(87);
		pq.add(67);
		pq.add(50);
		
		System.out.println(pq);
		System.out.println(pq.peek());//return head of queue
		System.out.println(pq.poll());//return and delete head of queue

		System.out.println(pq);
		
		System.out.println("===============Travsering Of PriorityQueue============");
		System.out.println("=================Using each For Loop=================");
		for(Integer obj:pq)
		{
			System.out.println(obj);
		}
		
		System.out.println("=================Using Iterator=================");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
