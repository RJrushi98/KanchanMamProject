package collectionInfo;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> ll= new LinkedList<>();
		System.out.println(ll);
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('A');
		ll.add('B');
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst('M');
		ll.addLast('Z');
		System.out.println(ll);
		System.out.println(ll.contains('Z'));
		System.out.println(ll.element());  //return first element
		System.out.println(ll);
		System.out.println(ll.peek());
		
		System.out.println(ll.poll());//delete head element
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		ll.offer('X');
		System.out.println(ll);
		System.out.println(ll.offerFirst('L'));
		ll.offerLast('J');
		System.out.println(ll);
	}

}
