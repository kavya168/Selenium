package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("email"));
        ele.sendKeys("kavyadv2003@gmail.com");
        Thread.sleep(2000);
        WebElement ele1 = driver.findElement(By.name("pass"));
        ele1.sendKeys("Kavyadv@21");
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.name("login"));
        Thread.sleep(2000);
        ele2.click();
	}

}
