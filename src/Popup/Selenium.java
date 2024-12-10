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
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		ArrayList<WebElement> arr=new ArrayList<WebElement>();
		arr.add(net);
		arr.add(ruby);
		arr.add(python);
		arr.add(js);
		Actions a=new Actions(driver);
		int count = arr.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		    WebElement win = arr.get(i);
			a.contextClick(win).perform();
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		Set<String> wins = driver.getWindowHandles();
		for(String w:wins)
		{
			driver.switchTo().window(w);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}

}
