package constructor;

public class Cons3 {

	int roll;
	String name;
	float marks;
	char gender;
	public Cons3() {
		roll=10;
		name="kanchan";
		gender='F';
		marks=85.25f;
	}
	public static void main(String[] args) {
		Cons3 c=new Cons3();
		c.display();

	}
	public void display()
	{
		System.out.println("My name is "+name);
		System.out.println("My Roll No is "+roll);
		System.out.println("My gender is "+gender);
		System.out.println("My marks is "+marks);
	}

}
