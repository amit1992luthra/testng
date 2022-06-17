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
	
	
	@Test(enabled = false)
	public void testcase1()
	{
		System.out.println("test case 1");
		driver.findElement(By.name("lastName")).sendKeys("last");
		driver.findElement(By.name("userName")).sendKeys("amit@a.com");
		driver.findElement(By.name("email")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		String tag=	driver.findElement(By.xpath("//*[text()='Phone:']")).getTagName();
		System.out.println(tag);
		driver.findElement(By.name("submit")).click();
	}
	
	@Test(enabled = true)
	public void testcase2()
	{
		System.out.println("test case 2");
	}
	

	@Test
	public void testcase3()
	{
		System.out.println("test case 3");
	}
	
	
	@AfterMethod
	public void after()
	{
		//driver.quit();
	}

}
