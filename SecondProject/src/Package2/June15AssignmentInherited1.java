package Package2;

public class June15AssignmentInherited1 extends June15Assignment1{
	
		public June15AssignmentInherited1()
		{
			this(78);
			System.out.println("Child Default constructor");
		}

		public June15AssignmentInherited1(int a)
		{
			this(34,78);
			System.out.println("Child One Parameterized constructor");
		}
		
		public June15AssignmentInherited1(int a,int b )
		{
			super(23);
			System.out.println("Child Two Parameterized constructor");
		}

		public June15AssignmentInherited1(int a,int b,int c )
		{
			this();
			System.out.println("Child Three Parameterized constructor");
		}

		
		public static void main(String[] args) 
		{
			June15AssignmentInherited1 object = new June15AssignmentInherited1(12,45,89);
		}
		


}
