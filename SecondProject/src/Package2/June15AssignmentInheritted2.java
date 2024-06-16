package Package2;

public class June15AssignmentInheritted2 extends June15Assignmnet2{

	public void method5()
	{
		super.method3(34, 12);
		System.out.println("Child Default constructor");
	}

	public void method6(int a)
	{
		this.method7(34, 76);
		System.out.println("Child One Parameterized constructor");
	}
	
	public void method7(int a,int b )
	{
		this.method8(23,56, 76);
		System.out.println("Child Two Parameterized constructor");
	}

	public void method8(int a,int b,int c )
	{
		this.method5();
		System.out.println("Child Three Parameterized constructor");
	}

	
	public static void main(String[] args) 
	{
		June15AssignmentInheritted2 object6 = new June15AssignmentInheritted2();
		object6.method6(5);
	}
	

}
