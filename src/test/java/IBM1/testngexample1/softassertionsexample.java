package IBM1.testngexample1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertionsexample {

	
	@Test()
	public void hardassert()
	{
		
		String Expected = "IBMBatch";
		String Actual = "IBM";
		//Assert.assertEquals(Actual, Expected); //hard assertion
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(Actual, Expected);
		System.out.println("after assertion");
		//obj.assertAll();
	}
}
