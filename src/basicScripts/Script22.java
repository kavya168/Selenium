package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		   int count = link.size();
		   System.out.println(count);
		 
		

	}

}
