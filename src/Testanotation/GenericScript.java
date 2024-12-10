package Testanotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GenericScript {
	WebDriver driver;
	@BeforeMethod
	public void Browsersetup() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
