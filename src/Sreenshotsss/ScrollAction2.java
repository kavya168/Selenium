package Sreenshotsss;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class ScrollAction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement link = driver.findElement(By.xpath("//a[.='Facebook']"));
	   org.openqa.selenium.Point loc = link.getLocation();
	   System.out.println(loc);
	   int x=loc.getX();
	   int y=loc.getY();
	   System.out.println(x);
	   System.out.println(y);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,"+y+")");
	  Thread.sleep(2000);
	  WebElement link1 = driver.findElement(By.xpath("//a[.='Facebook']"));
	  link1.click();
	}

}
