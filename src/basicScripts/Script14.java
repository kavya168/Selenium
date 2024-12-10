package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		WebElement un = driver.findElement(By.cssSelector("main[class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded bg-[#feebfc] hover:shadow-slate-400 shadow-lg group aos-init aos-animate']"));
		un.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.cssSelector("input[id='name']"));
		Thread.sleep(2000);
		name.sendKeys("kavya");
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		Thread.sleep(2000);
		email.sendKeys("kavyadv2003@gmail.com");
		WebElement psw = driver.findElement(By.cssSelector("input[id='password']"));
		Thread.sleep(2000);
		psw.sendKeys("kavyadv@21");
		WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
		Thread.sleep(2000);
		button.click();
	}

}
