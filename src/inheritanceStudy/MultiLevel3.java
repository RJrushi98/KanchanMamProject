package inheritanceStudy;

public class MultiLevel3 extends MultiLevel2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiLevel3 m3=new MultiLevel3();
		m3.hello(); //from MultiLevel1 class
		m3.hii(); //from MultiLevel2 class
		m3.hiiii(); //from MultiLevel3 class
	}

	public void hiiii() {
		System.out.println("This is from class Multilevel3");
	}
}
