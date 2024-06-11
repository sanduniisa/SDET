package Package2;

import java.util.Scanner;

import Package1.Arithmetic;

public class Assignment2 {
	public static void main(String[] args) {
		
		Arithmetic obj = new Arithmetic();
		Scanner obj2 = new Scanner(System.in);
		
		System.out.println("Please Enter the value of X1");
		int X1 = obj2.nextInt();
		
		
		System.out.println("Please Enter the value of X2");
		int X2 = obj2.nextInt();
		
		
		System.out.println("Please Enter the value of X3");
		int X3 = obj2.nextInt();
		
		
		System.out.println("Please Enter the value of X4");
		int X4 = obj2.nextInt();
	
		
		System.out.println("Please Enter the value of X5");
		int X5 = obj2.nextInt();
	
		
		System.out.println("Please Enter the value of X6");
		int X6 = obj2.nextInt();
		
		
		//solving this expression ((((X1 + X2)-X3)+X4)*X5)/X6)
		
		int SumResult1 = obj.Sum(X1, X2);
		int SubResult = obj.Sub(SumResult1, X3);
		int SumResult2 = obj.Sum(SubResult, X4);
		int MultiResult = obj.Multi(SumResult2, X5);
		obj.Devi(MultiResult, X6);
		
	}

}
