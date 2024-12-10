package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Hp/Desktop/HTML/webpage6.html");
	  WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	  Thread.sleep(2000);
	  usn.sendKeys(Keys.CONTROL+"a");
	  Thread.sleep(2000);
	  usn.sendKeys(Keys.BACK_SPACE);
	}

}
