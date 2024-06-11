package Package1;
public class Arithmetic {

	public int Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("The Addition is   : "+c);
		return c;
	}
	
	public int Sub(int a, int b)
	{
		int c = a-b;
		System.out.println("The Subtracton is   : "+c);
		return c;
	}
	
	public int Multi(int a, int b)
	{
		int c = a * b;
		System.out.println("The Multiplication is   : "+c);
		return c;
	}
	
	public void Devi(int a, int b)
	{
		int c = a/b;
		System.out.println("The Division result is   : "+c);
	}
	
	public static void main(String[] args)
	{
		//Assignment no1: ((((((10+2)+2)-2)*2)/2)
		System.out.println("Assignment 1");
		
		Arithmetic obj = new Arithmetic();
		int sumResult1 = obj.Sum(10, 2);
		int sumResult2 = obj.Sum(sumResult1, 2);
		int subResult = obj.Sub(sumResult2, 2);
		int multiResult = obj.Multi(subResult, 2);
		obj.Devi(multiResult, 2);
		
		//Assignment no2: ((((((10*2)-2)+2)-2)/2)
		System.out.println("Assignment 2");
		
		Arithmetic obj2 = new Arithmetic();
		int multiResult2 = obj2.Multi(10, 2);
		int subResult1 = obj2.Sub(multiResult2, 2);
		int sumResult3 = obj2.Sum(subResult1, 2);
		int subResult2 = obj2.Sub(sumResult3, 2);
		obj.Devi(subResult2, 2);
	//sum sub multi div ehema ewain keepayak thibbata eka method ekak thibbama athi call karanna puluwan parameters daala.
	//wena wenama prints ganna ona nisa syso wena wenama ganna ona
		
		
	}
}