package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Script27 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		 WebElement home = driver.findElement(By.xpath("//img[@alt='Home & Furniture']"));
		 Actions a=new Actions(driver);
		 Thread.sleep(2000);
		 a.moveToElement(home).perform();
		 
	
				


	}

}
