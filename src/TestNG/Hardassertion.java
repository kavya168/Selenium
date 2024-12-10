package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
	@Test
	public void Webpage() {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();                                             
		driver.get("https://www.flipkart.com/");
		String Expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle,Expectedtitle);
		System.out.println(Actualtitle);
		driver.quit();
	}
	

}
