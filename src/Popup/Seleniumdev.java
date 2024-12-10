package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Seleniumdev {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement net = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
		Thread.sleep(2000);
		WebElement ruby = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		Thread.sleep(2000);
		WebElement python = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		Thread.sleep(2000);
		WebElement js= driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		Actions a=new Actions(driver);
			a.contextClick(net).perform();
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			a.contextClick(ruby).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			a.contextClick(python).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			a.contextClick(js).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(wins);
		int count = arr.size();
		for(int i=0;i<count;i++)
		{
			String win = arr.get(i);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}
	}
}


	

	


