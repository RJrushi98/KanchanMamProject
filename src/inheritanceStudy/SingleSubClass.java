package inheritanceStudy;

public class SingleSubClass extends SingleLevel {

	public String name;
public static void main(String[] args) {
	SingleSubClass sb=new SingleSubClass();

	//SubClass Variable and method calling
	
	sb.display();
	sb.name="Vivo";
	System.out.println("name of phone is "+sb.name);

	System.out.println("Variale and method from Super class");
	//Super class variable and method calling by subclass object
	sb.price=12000;
	System.out.println("Price of Phone is "+sb.price);
	sb.makeCall();
	sb.getCharge();
			
	
}

public void display()
{
	System.out.println("Display method from sub class");
}
}
