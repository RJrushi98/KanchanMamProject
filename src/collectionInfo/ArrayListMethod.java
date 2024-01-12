package collectionInfo;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<Object> a1=new ArrayList<>();
		
		a1.add("Manchar");
		a1.add("pune");
		a1.add("Mumbai");
		System.out.println(a1);
		System.out.println("***********************************************");
		a1.add(2, "Delhi");  //add by index
		//a1.clear();       //clear all data from arraylist
		System.out.println(a1);
		System.out.println("***********************************************");
		Object newObj=a1.clone();  //create copy of arraylist
		System.out.println(newObj);
		System.out.println("***********************************************");
		System.out.println(a1.contains("pune")); //return true if value is in arraylist
		System.out.println("***********************************************");
		a1.ensureCapacity(3);  //Give the minimum capacity
		System.out.println("***********************************************");
		System.out.println(a1.equals(newObj)); //check the 2 Arraylist equal or not
		
		a1.add("Thane");
		a1.add("MP");
		System.out.println(a1.equals(newObj));
		System.out.println("***********************************************");
		System.out.println(a1.get(2));  //Return element by index
		System.out.println("***********************************************");
		System.out.println(a1.indexOf("pune")); //return the index value of element
		System.out.println("***********************************************");
		System.out.println(a1.isEmpty());  //check arraylist is empty or not
		//a1.clear();
		System.out.println(a1.isEmpty());  //check arraylist is empty or not
		System.out.println("***********************************************");
		System.out.println(a1.remove(3));  //delete the element by selected position
		System.out.println(a1);
		System.out.println("***********************************************");
		a1.set(2, "UP");  //replace the element of specific index
		System.out.println(a1);
		System.out.println(a1.lastIndexOf("pune"));
	}

}
