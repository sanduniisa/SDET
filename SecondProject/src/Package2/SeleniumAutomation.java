package Package2;

public class SeleniumAutomation extends WebAutomation{
     public void m2()
     {
    	 System.out.println("Son1 Class method for multi level inheritence");
     }
     
     public static void main(String[] args)
 	{
 		SeleniumAutomation SeAuObj = new SeleniumAutomation();
 		SeAuObj.method1(); //Grand father class method
 		SeAuObj.m1();//father class method
 		SeAuObj.m2();//son class method
 		
 		//multi level inheritence
 		
 	}
}
