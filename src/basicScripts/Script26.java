package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script26 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("kavya@gamil.com");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("kavya@123");
		Thread.sleep(2000);
		WebElement password1= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		password1.sendKeys("kavya@123");
		Thread.sleep(2000);
		WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(frame1);
		WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("kavya");
		Thread.sleep(2000);
		WebElement password2= driver.findElement(By.xpath("//input[@id='password']"));
		password2.sendKeys("kavya@123");
		Thread.sleep(2000);
		WebElement button1= driver.findElement(By.xpath("//button[@type='submit']"));
		button1.click();
		
		
		

	}

}
