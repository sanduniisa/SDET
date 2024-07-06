package Package1;


//Swapping Two Numbers using a third variable
import java.util.Scanner;

public class SwappingTwoNumbersUsingAvariable {

	public void SwapNumbersMethod1() {
		
		System.out.println("Enter two numbers X and Y");
		Scanner s1= new Scanner(System.in);
		int X = s1.nextInt();
		int Y = s1.nextInt();
		int temp;
		
		temp = X;
		X = Y;
		Y =temp;
		
		
		System.out.println("Before Swapping the numbers are " + X + " and " + Y);
		
	}
	public static void main(String[] args) {
		
		SwappingTwoNumbersUsingAvariable obj1= new SwappingTwoNumbersUsingAvariable();
		obj1.SwapNumbersMethod1();
		
	}
}
