package Testanotation;

import org.testng.annotations.Test;

public class TestCase04 extends GenericScript
{
	@Test
	public void url() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	}

}
