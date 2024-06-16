package Package2;

public class June15Assignment1 {
	
	public June15Assignment1()
	{
		this(34,89);
		System.out.println("Parent Default constructor");
	}

	public June15Assignment1(int a)
	{
		this(89,67,45);
		System.out.println("Parent One Parameterized constructor");
	}
	
	public June15Assignment1(int a,int b )
	{
		
		System.out.println("Parent Two Parameterized constructor");
	}
	
	public June15Assignment1(int a,int b ,int c )
	{
		this();
		System.out.println("Parent Three Parameterized constructor");
	}


}
