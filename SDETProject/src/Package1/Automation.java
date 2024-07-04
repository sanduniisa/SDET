package Package1;
//has a relationship concept with SDET java class
public class Automation {
	
	public void method1()
	{
		System.out.println("Has a relationship");
	}
	public void method2()
	{
		System.out.println("Has a relationship method 2");
	}
	
	public static void main(String[] args) 
	{
	  Automation obj = new Automation();
	  Automation obj2 = new Automation();
	  obj.method1();
	  obj2.method2();
	}
}
