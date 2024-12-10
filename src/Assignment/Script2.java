package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		WebElement un = driver.findElement(By.cssSelector("main[class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded bg-[#feebfc] hover:shadow-slate-400 shadow-lg group aos-init aos-animate']"));
		un.click();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//section[.='Button']"));
		button.click();
		Thread.sleep(2000);
		WebElement Yes = driver.findElement(By.xpath("(//button[.='Yes'])[1]"));
		Thread.sleep(2000);
		Yes.click();
		Thread.sleep(2000);
		WebElement no = driver.findElement(By.xpath("(//button[.='No'])[2]"));
		no.click();
		Thread.sleep(2000);
		WebElement one = driver.findElement(By.xpath("(//button[1])[4]"));
		one.click();
		Thread.sleep(2000);
		WebElement two = driver.findElement(By.xpath("(//button[2])[3]"));
		two.click();
		Thread.sleep(2000);
		WebElement three = driver.findElement(By.xpath("//button[3]"));
		three.click();
		Thread.sleep(2000);
		WebElement four = driver.findElement(By.xpath("//button[4]"));
		four.click();
		Thread.sleep(2000);
		WebElement five = driver.findElement(By.xpath("//button[5]"));
		five.click();
		
	}

}
