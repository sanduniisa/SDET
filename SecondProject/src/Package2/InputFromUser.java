package Package2;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) 
	{
		System.out.println("Please Enter Your Years of Experience");
		Scanner obj22 = new Scanner(System.in);
		int a = obj22.nextInt();
		System.out.println("Your Years of Experience is : " +a);
		System.out.println("Enter a float value");
		float f = obj22.nextFloat();
		System.out.println("Float value you entered is : " +f);
	}
}
