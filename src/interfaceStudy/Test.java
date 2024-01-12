package interfaceStudy;

public class Test implements MyInterface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.sample();
		System.out.println(a);
		System.out.println(b);
	}

	@Override
	public void sample() {
		System.out.println("Sample method from Interface1");
		
	}

	@Override
	public void sample1() {
		System.out.println("Sample method from Interface1");
	}

}
