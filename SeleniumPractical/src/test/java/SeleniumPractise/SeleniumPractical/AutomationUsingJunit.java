package SeleniumPractise.SeleniumPractical;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationUsingJunit {
	
	
	ChromeDriver driver; //declare the driver object

	@Before
	public void browserLaunch() {
//		ChromeDriver driver= new ChromeDriver(); here the driver is local. so for that declare before and create the object
		
		
		driver= new ChromeDriver(); //object creation
		driver.get("https://www.facebook.com"); 
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
	}
	
	@Test
	public void testCase() throws InterruptedException {
		
		
		WebElement createaccountElement = driver.findElement(By.linkText("Create new account"));
		createaccountElement.click();
		Thread.sleep(3000);
		
		WebElement firstnameElement = driver.findElement(By.name("firstname"));
		firstnameElement.sendKeys("Saaaz");
		
		WebElement surnameElement = driver.findElement(By.name("lastname"));
		surnameElement.sendKeys("Senarath");
		
		WebElement emailElement = driver.findElement(By.name("reg_email__"));
		emailElement.sendKeys("imalsha.senarath@gmail.com");
		
		WebElement reenteremailElement = driver.findElement(By.name("reg_email_confirmation__"));
		reenteremailElement.sendKeys("imalsha.senarath@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("reg_passwd__"));
		passwordElement.sendKeys("123Y$code");
		
		Select daySelect = new Select(driver.findElement(By.id("day")));
		daySelect.selectByValue("23");
		
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("Jul");
		
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		yearSelect.selectByValue("1990");
				
		WebElement sexElement = driver.findElement(By.xpath("//label[text()='Female']"));
		sexElement.click();
		
		WebElement signupElement = driver.findElement(By.name("websubmit"));
		signupElement.click();
		
		Thread.sleep(3000);
		
	}
	
	@After
	public void testclosure() {
		driver.close();
	}
}
