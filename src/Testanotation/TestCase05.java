package Testanotation;

import org.testng.annotations.Test;

public class TestCase05 extends GenericScript
{
	@Test
	public void Src() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
	}

}
