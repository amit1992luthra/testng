package IBM1.testngexample1;

import org.testng.annotations.Test;

public class invocationcountex {
	
	@Test(invocationCount = 1)
	public void testcase1()
	{
		System.out.println("invocation class testcase 1");
	}
	
	@Test(invocationCount = 2)
	public void testcase2()
	{
		System.out.println("invocation class testcase 2");
	}
	
	@Test(invocationCount = 3)
	public void testcase3()
	{
		System.out.println("invocation class test case 3");
	}
	

	

}
