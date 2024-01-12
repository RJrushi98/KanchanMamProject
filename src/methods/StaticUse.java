package methods;

public class StaticUse {

	public static void main(String[] args) {
		sample();//calling static method from same class
		sample1();
		SampleClass1.sam();//calling static method from different class
		SampleClass1.sam1();
	}
	public static void sample() {
		System.out.println("Hi this is static regular method sample");
	}
	public static void sample1() {
		System.out.println("Hi this is static regular method sample1");
	}

}
