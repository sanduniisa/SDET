package Package2;

import java.util.Scanner;

import Package1.Arithmetic;

public class Assignment3 {
		
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
			
			
			//solving this expression ((((X1 * X2)+X3)-X4)-X5)/X6)
			
			int MultirResult = obj.Multi(X1, X2);
			int SumResult = obj.Sum(MultirResult, X3);
			int SubResult1 = obj.Sub(SumResult, X4);
			int SubResult2 = obj.Sub(SubResult1, X5);
			obj.Devi(SubResult2, X6);
			
		}


}
