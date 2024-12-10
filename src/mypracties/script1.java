package mypracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		WebElement text = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		text.sendKeys("kavyadv2003@gmail.com");
		WebElement psw = driver.findElement(By.xpath("//input[@ aria-label='Password']"));
		psw.sendKeys("Kavyadv@18");
		WebElement butt = driver.findElement(By.xpath("//button[@ type='submit']"));
		butt.click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
