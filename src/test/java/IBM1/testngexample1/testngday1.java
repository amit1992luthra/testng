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
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@Test
	public void zbookingtickets()
	{
		System.out.println("generating PNR Number");
	}
	
	@Test(dependsOnMethods="zbookingtickets")
	public void checkingPNRStatus()
	{
		System.out.println("gchecking pnr status");
	}
	
	
	
	
	@AfterMethod
	public void after()
	{
		//driver.quit();
	}

}
