package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Options op= driver.manage();
		Window w=op.window();
		w.maximize();
		
	}
	
	//login to the you tube and click trending then logout
	@Test
	public void testCase1() throws InterruptedException {
		WebElement signInElement = driver.findElement(By.xpath("//a[contains(@aria-label,'Sign in')]"));
		signInElement.click();
		
		WebElement emailElement = driver.findElement(By.xpath("//input[@type='email']"));
		emailElement.sendKeys("myautomationpractise.testing@gmail.com");
		
		WebElement nextWebElement= driver.findElement(By.xpath("//div[@data-primary-action-label='Next']"));
		nextWebElement.click();
//		
//		WebElement passwordElement = driver.findElement(By.xpath("//input[@name='Passwd']"));
//		passwordElement.sendKeys("FourSeason1976%");
//		
		
		
		Thread.sleep(1000);
	}
	
	
	@AfterMethod
	public void browserClose() {
		driver.close();
	}

}
