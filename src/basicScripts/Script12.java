package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Hp/Desktop/HTML/youtube.html");
		Thread.sleep(3000);
		WebElement usn = driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(3000);
		usn.sendKeys("kavya");
		WebElement cb = driver.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(3000);
         cb.click();
        WebElement rb = driver.findElement(By.cssSelector("input[type='radio']"));
        Thread.sleep(3000);
         rb.click();
         WebElement link = driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
         Thread.sleep(3000);
         link.click();
         Thread.sleep(3000);
         driver.quit();
         
	}
	
}
