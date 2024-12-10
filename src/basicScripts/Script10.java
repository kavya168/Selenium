package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();                                             
		driver.get("file:///C:/Users/Hp/Desktop/HTML/instagram.html");
		WebElement ele = driver.findElement(By.id("t1"));
		 ele.sendKeys("kavya");
		 WebElement ele1 = driver.findElement(By.name("n1"));
		 ele1.sendKeys("kavyadv@21");
		WebElement ele2 = driver.findElement(By.className("c1"));
		ele2.sendKeys("kavyadv@21");
		WebElement ele3 = driver.findElement(By.id("t1"));
		ele3.clear();
		WebElement ele4 = driver.findElement(By.linkText("instagram 2024"));
		ele4.click();
	}
}
