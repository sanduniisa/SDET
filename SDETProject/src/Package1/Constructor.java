package Package1;

public class Constructor {
	
	public Constructor() {
		this(23,56,76);
		System.out.println("Default Constructor");		
	}
   public Constructor(int x) {
		this();
		System.out.println("One Parameterized Constructor");	
	}
   public Constructor(int x, int y) {
		this(6);
		System.out.println("Two Parameterized Constructor");	
	}
   public Constructor(int x, int y, int z) {   
		System.out.println("Three Parameterized Constructor");	
	}
   public static void main(String[] args) {
	   Constructor obj = new Constructor(43,66);	   
   }
}
