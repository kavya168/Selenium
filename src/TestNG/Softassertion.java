package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
	@Test
	public void Wedpage()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();                                             
		driver.get("https://www.flipkart.com/");
		String Expectedtitle="Online Shopping Site for Mobiles,";
		String Actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Actualtitle);
		driver.quit();
		s.assertAll();
	
		
	}

}
