package encapsulation;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		
		t.addition();
		t.getAvalue();
		t.getBvalue();
	}
	private int a=10;
	private int b=20;
	public void addition()
	{
	int sum=a+b;
	System.out.println(sum);
	}
	public int getAvalue()
	{
	return a;
	}
	public int getBvalue()
	{
	return b;
	}

}
