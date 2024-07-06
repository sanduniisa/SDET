package Package1;

import java.util.Scanner;

public class nestedIf {
	
public void checkNumbr() {
		
		System.out.println("insert a number");
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
        
		if (a>0) {
			
			if (a%2==0)
			{
				System.out.println("the number is positive even  " +a);
				
			} else 
			{
				System.out.println("the number is positive odd  " +a);
			}

		}else 
		{
			System.out.println("please enter a positive number  ");
		}
	 }
    public static void main(String[] args) {
    	nestedIf obj= new nestedIf();
        obj.checkNumbr();	
     }

}
