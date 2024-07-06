package Package1;
import java.util.Scanner;
public class AmstrongChecker {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        boolean isArmstrong = checkArmstrong(number);
	        
	        if (isArmstrong) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean checkArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = 0;
	        
	        // Find the number of digits in the number
	        for (int temp = number; temp != 0; temp /= 10) {
	            n++;
	        }
	        
	        // Calculate the sum of the n-th powers of its digits
	        for (int temp = number; temp != 0; temp /= 10) {
	            int digit = temp % 10;
	            result += Math.pow(digit, n);
	        }
	        
	        // Check if the original number is equal to the result
	        return result == originalNumber;
	    
	}


}
