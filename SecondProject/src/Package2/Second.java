package Package2;

public class Second extends First{
	
	public Second()
	{
		System.out.println("Child Default constructor");
	}

	public Second(int a)
	{
		super(445,45);
		System.out.println("Child One Parameterized constructor");
	}
	
	public Second(int a,int b )
	{
		
		System.out.println("Child Two Parameterized constructor");
	}

	public static void main(String[] args) 
	{
		Second obj45 = new Second(34);
	}
}
