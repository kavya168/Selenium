package Testanotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase02 extends GenericScript
{
	@Test
	public void psw() throws InterruptedException
	{
		boolean displayed = driver.findElement(By.id("pass")).isDisplayed();
		Thread.sleep(2000);
		boolean enabled = driver.findElement(By.id("pass")).isEnabled();
		System.out.println(displayed+" "+enabled);
	}

}
