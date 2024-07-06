package Package1;

//1
//12
//123
//1234
//12345

public class LoopAssignment3 {
	
	public static void main(String[] args) {
		 for (int i = 0; i <=5; i++) { //outer loop for rows
			 
			 for (int j = 1; j<=i ; j++) { //inner loop for columns
				 System.out.print(j);
				
			}
			 System.out.println(); //will move cursor to the next line
			
		}


	}


}
