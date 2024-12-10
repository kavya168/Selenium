package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hp/Desktop/HTML/webpage5.html");
		List<WebElement> che = driver.findElements(By.xpath("//input"));
		int count=che.size();
		for(int i=0; i<count; i++)
		{
			WebElement link=che.get(i);
			link.click();
		}
		Thread.sleep(2000);
		for(int i=count-1;i>=0;i--)
		{
			WebElement link=che.get(i);
			link.click();
		}
		
	}

}
