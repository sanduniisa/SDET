package Package2;

public class APIAutomation extends Automation {
	public void m3()
	{
		System.out.println("Son2 Class method for multi level inheritence");
	}

	 public static void main(String[] args)
	 	{
		 APIAutomation APIAuObj = new APIAutomation();
		 APIAuObj.method1();//parent class method
		 APIAuObj.m3();//son 2 class method		
	 	}
	 
	 //hierarchical inheritance
	 
	 /*in hierarchical inheritance - with the help of son1 class object we can call 
	 Son1 variables + methods and Parent variables + methods.*/
	 
	 /*in hierarchical inheritance - with the help of son2 class object we can call 
	 Son2 variables + methods and Parent variables + methods.*/
	 
	 /*in hierarchical inheritance - There is no relationship between Son1 and Son2.*/
	 
	 
	
}
