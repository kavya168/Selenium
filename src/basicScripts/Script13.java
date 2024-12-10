package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	    WebElement un = driver.findElement(By.cssSelector("input[id='email']"));
	    Thread.sleep(2000);
	    un.sendKeys("kavyadv2003@gmail.com");
	    Thread.sleep(2000);
	    WebElement psw = driver.findElement(By.cssSelector("input[id='pass']"));
	    Thread.sleep(2000);
        psw.sendKeys("kavyadv@21");
        WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
        login.click();
        Thread.sleep(2000);
        driver.quit();
	}

}
