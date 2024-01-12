package ThisAndSuper;

public class ThisDemo {

	 int  a=30;
	 
	 public ThisDemo()
	 {
		 int a=20;
		 int result=this.a+20;
		 System.out.println("Constructor Print Result "+result);
	 }
	public static void main(String[] args) {
		ThisDemo t=new ThisDemo();
		t.A();

	}
	
	public void A() {
		 int a=40;
		int result=a+10;
		System.out.println("Print Result "+result);
		
		result=this.a+10;
		System.out.println("Print Result "+result);
	}
	

}
