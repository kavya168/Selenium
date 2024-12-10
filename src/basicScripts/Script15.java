package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
		Thread.sleep(2000);
		search.sendKeys("Humare Ram Ramleela");
		WebElement search1 = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		Thread.sleep(2000);
		search1.click();
		WebElement video = driver.findElement(By.cssSelector("//video[@ data-no-fullscreen='true']"));
		Thread.sleep(2000);
		video.click();
	}

}
