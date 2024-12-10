package Testanotation;

import org.testng.annotations.Test;

public class TestCase03 extends GenericScript
{
	@Test
	public void Title() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
