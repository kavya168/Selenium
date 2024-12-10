package mypracties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
         search.sendKeys("wrist watch for man");
         Thread.sleep(2000);
         WebElement searchclick = driver.findElement(By.id("nav-search-submit-button"));
         searchclick.click();
         Thread.sleep(5000);
         WebElement titan = driver.findElement(By.xpath("(//span[.='Titan'])[7]"));
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView()",titan);
         titan.click();
         Thread.sleep(2000);
         WebElement Leather = driver.findElement(By.xpath("//span[.='Leather']"));
         js.executeScript("arguments[0].scrollIntoView()",Leather);
         Leather.click();
         Thread.sleep(2000);
         WebElement titan1 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base a-text-bold'])[2]"));
         titan1.click();
         Thread.sleep(5000);
         WebElement img = driver.findElement(By.xpath("//span[.='Titan']"));
         img.click();
	}

}
