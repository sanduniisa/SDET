package SeleniumPractise.SeleniumPractical;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitExample {
	
	@BeforeClass
	public static void  beforeClass() {
		System.out.println("Before class .....");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class .....");
	}
	
	@Before
	public void init() {
		System.out.println("Before annotation");
	}
	
	
	@Test
	public void testcase1() {
		System.out.println("Test Case 1");
		
	}
	
	@Ignore  //to ignore a test case from the execution
	@Test
	public void testcase2() {
		System.out.println("Test Case 2");
		
	}
	
	
	@After
	public void closure() {
		System.out.println("After annotation");
	}

}
