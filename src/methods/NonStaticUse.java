package methods;

public class NonStaticUse {

	public static void main(String[] args) {
		NonStaticUse obj=new NonStaticUse();
		obj.sam(); //calling non-static method from same class
		obj.sam1();
		NonStaticClass2 n2=new NonStaticClass2();
		n2.xyz();//calling non-static method from different class
		n2.xyz1();
	}

	public void sam() {
		System.out.println("This is non-static method from same class");
	}
	public void sam1() {
		System.out.println("This is non-static method from same class");
	}
}
