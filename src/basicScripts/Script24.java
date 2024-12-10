package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script24 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hp/Desktop/HTML/mainpage1.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("kavya");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("kavya@34");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("8904357897");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("kavya@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement mob1 = driver.findElement(By.xpath("//input[@type='text']"));
		mob1.clear();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement usn1 = driver.findElement(By.xpath("//input[@type='text']"));
		usn1.clear();
		


	}

}
