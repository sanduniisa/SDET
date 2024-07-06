package Package1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is " + factorial);
        
        scanner.close();
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        
        long result = 1;
        
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        
        return result;
    }
}


// recursive approach

//import java.util.Scanner;
//
//public class Factorial {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter a number to calculate its factorial: ");
//        int number = scanner.nextInt();
//        
//        long factorial = calculateFactorial(number);
//        
//        System.out.println("The factorial of " + number + " is " + factorial);
//        
//        scanner.close();
//    }
//
//    public static long calculateFactorial(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Number must be non-negative.");
//        }
//        
//        if (number == 0 || number == 1) {
//            return 1;
//        }
//        
//        return number * calculateFactorial(number - 1);
//    }
//}
