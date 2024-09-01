package YTFramework.YTW;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AnnotationExecutionExample {

	
	@BeforeSuite
	public void bSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}

	
	@AfterSuite
	public void aSuite() {
		System.out.println("After Suite");
	}
	
	
	@Test(priority = 1)
	public void testCase1() {
		System.out.println("Test Case 1....");
	}
	
	@Test(priority = 0)
	public void testCase2() {
		System.out.println("Test Case 2....");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Test Case 3....");
	}
	
	@Test(dependsOnMethods = "testCase3")
	public void testCase4() {
		System.out.println("Test Case 4....");
	}
	
	@Test(enabled = false)
	public void testCase5() {
		System.out.println("Test Case 5....");
	}
}
