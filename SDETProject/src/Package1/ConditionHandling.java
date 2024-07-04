package Package1;

import java.util.Scanner;

public class ConditionHandling {

	public void checkEvenOdd() {
		
		System.out.println("insert a number");
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		if (a%2==0) {
			
			System.out.println("the number is even  " +a);
			
		} else {
			System.out.println("the number is odd  " +a);

		}
	 }
    public static void main(String[] args) {
    	ConditionHandling obj= new ConditionHandling();
        obj.checkEvenOdd();	
     }

}
