package Package1;

import java.util.Scanner;


//Swapping Two Numbers without using a third variable
public class SwappingTwoNumbersWithoutAvariable {
	
public void SwapNumbersMethod2() {
		
		System.out.println("Enter two numbers X and Y");
		Scanner s1= new Scanner(System.in);
		int X = s1.nextInt();
		int Y = s1.nextInt();
		int temp;
		
		X = X+Y;
		Y = X -Y;
		X = X -Y;
		
		
		System.out.println("Before Swapping the numbers are " + X + " and " + Y);
		
	}
	public static void main(String[] args) {
		
		SwappingTwoNumbersWithoutAvariable obj1= new SwappingTwoNumbersWithoutAvariable();
		obj1.SwapNumbersMethod2();
		
	}

}
