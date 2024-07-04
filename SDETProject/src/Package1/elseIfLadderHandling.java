package Package1;

import java.util.Scanner;

public class elseIfLadderHandling {
	
public void checkResults() {
		
		System.out.println("insert the marks");
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
        
		if ((a<0)&&(a<35)) {
			
			System.out.println("Failed .........................");
			
		} 
		else if ((a>=35)&&(a<60)) {
			System.out.println("Passed ..........................");
			
		}
		else if ((a>=60)&&(a<80)) {
			System.out.println("First Class.......................");
			
		}
		else if ((a>=80)&&(a<=100)) {
			System.out.println("Merit Class.......................");
			
		}else {
			System.out.println("Please check the marks and re-enter");
		}
			

		
	 }
    public static void main(String[] args) {
    	elseIfLadderHandling obj= new elseIfLadderHandling();
        obj.checkResults();	
     }

}
