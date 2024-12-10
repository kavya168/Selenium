package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script25 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hp/Desktop/HTML/mainpage2.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("kavya");
		Thread.sleep(2000);
		WebElement frame1= driver.findElement(By.id("k1"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("9766434678");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.id("k2"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("kavya@gmail.com");
		
		

	}

}
