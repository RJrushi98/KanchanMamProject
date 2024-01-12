package inheritanceStudy;

public class HierachicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hierachical2 h2=new Hierachical2();
		h2.printA(); //from super class Hierachical1
		h2.printB();//from base class Hierachical2 
		
		Hierachical3 h3=new Hierachical3();
		h3.printA();//from super class Hierachical1
		h3.printC();//from base class Hierachical3

	}

}
