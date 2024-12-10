package Sreenshotsss;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;

public class LinksScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int countoflinks = links.size();
		for(int i=0;i<=countoflinks;i++)
		{
			WebElement link = links.get(i);
			File temp = link.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Screenshots/"+i+"Links.png");
			FileHandler.copy(temp, perm);
		}
	}
}
