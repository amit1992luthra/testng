package IBM1.testngexample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngday1 {
	
	WebDriver driver;
	
	/*@BeforeSuite
	public void example()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void example1()
	{
		System.out.println("After suite");
	}
	
	*/
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();  //open my browser
		driver.get("https://www.google.com/");
	}
	
	@Test(groups={"regression","amit","smoke"})
	public void zbookingtickets()
	{
		System.out.println("testcase 1");
	}
	
	@Test(groups={"amit"})
	public void checkingPNRStatus()
	{
		System.out.println("test case 2");
	}
	
	@Test()
	public void checkingPNRStatus1()
	{
		System.out.println("test case 3");
	}
	
	@Test(groups={"regression","smoke"})
	public void checkingPNRStatus2()
	{
		System.out.println("test case 4");
	}
	
	@Test(groups={"amit","smoke"})
	public void checkingPNRStatus3()
	{
		System.out.println("test case 5");
	}
	
	
	
	
	
	@AfterMethod
	public void after()
	{
		//driver.quit();
	}

}
