package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1
{
	@Test(invocationCount = 0)
	public void Testcase()
	{
		Reporter.log("Hello",true);
	}
	@Test(invocationCount = 4)
	public void Testcase1()
	{
		Reporter.log("Hi",true);
	}
	
	

}
