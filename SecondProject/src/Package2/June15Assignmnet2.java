package Package2;

public class June15Assignmnet2 {

	public void method1()
	{
		this.method4(45, 32, 5);
		System.out.println("Parent Default constructor");
	}

	public void method2(int a)
	{
		this.method1();
		System.out.println("Parent One Parameterized constructor");
	}
	
	public void method3(int a,int b )
	{
		this.method2(45);
		System.out.println("Parent Two Parameterized constructor");
	}
	
	public void method4(int a,int b ,int c )
	{
		
		System.out.println("Parent Three Parameterized constructor");
	}
	

	public static void main(String[] args) 
	{
		June15Assignmnet2 object3 = new June15Assignmnet2();
		object3.method3(34, 12);
	}
	
}
