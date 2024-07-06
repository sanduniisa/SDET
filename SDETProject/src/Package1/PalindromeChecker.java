package Package1;

import java.util.Scanner;

public class PalindromeChecker {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPalindrome = checkPalindrome(number);
        
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        
        scanner.close();
    }

    public static boolean checkPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Check if the original number and the reversed number are the same
        return originalNumber == reversedNumber;
    }

}
