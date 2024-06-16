package Package2;

public class WebAutomation extends Automation {
	
	public void m1()
	{
		System.out.println("Child Class method");
		System.out.println("Father Class method for multi level inheritance");
		
	}
	
	public static void main(String[] args)
	{
		WebAutomation WbAuObj = new WebAutomation();
		WbAuObj.method1(); //parent class method
		WbAuObj.m1();//child class method
		
		//single level inheritence
		
	}

}
