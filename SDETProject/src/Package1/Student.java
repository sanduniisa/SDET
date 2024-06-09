package Package1;

public class Student {
	
	int age;  
	int rollNo;
	
	public void Display1() {
		System.out.println("Welcome to all of you!!!");
	}
	
	public void Display2() {
		System.out.println("Automation is very easy");
	}
	
public static void main(String[] args) 
{
  Student object = new Student();
  object.Display1();
  object.Display2();
  object.age = 30;
  object.rollNo =335;
  
  System.out.println("Age is : "+object.age);
  System.out.println("Roll No is  : "+object.rollNo);
  
}

}
