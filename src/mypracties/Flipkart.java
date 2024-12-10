package mypracties;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
       WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
       Thread.sleep(2000);
       search.sendKeys("iphone11");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//div[@style='height: 200px; width: 200px;'])[1]")).click();
       String p_browser = driver.getWindowHandle();
       System.out.println(p_browser);
       Set<String> win = driver.getWindowHandles();
       for(String wins:win) 
       {
       System.out.println(wins);
       if(!wins.equals(p_browser))
       {
       driver.switchTo().window(wins);
       Thread.sleep(4000);
       driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
       Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']")).sendKeys("8867340643");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
       Thread.sleep(2000);
       driver.close();
	} 
  }
}
}