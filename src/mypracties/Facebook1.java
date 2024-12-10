package mypracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kavyadv@gmail.com");
		WebElement psw = driver.findElement(By.id("pass"));
		psw.sendKeys("kavyadv@456");
		driver.navigate().refresh();
		email.sendKeys("kavyadv@gmail.com");
		psw.sendKeys("kavyadv@456");
		

	}

}
