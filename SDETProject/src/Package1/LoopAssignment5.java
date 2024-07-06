package Package1;

//     *
//    **
//   ***
//  ****
// *****

 
public class LoopAssignment5 {
	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {

	        // inner loop to print spaces.
	        for (int j= 1; j < i; j++) {
	            System.out.print(" ");
	        }

	        // inner loop to print stars.
	        for (int j = 0; j <= 5 - i; j++) {
	            System.out.print("*");
	        }

	        // printing new line for each row
	        System.out.println();
	    }
	}
	
	

}

