package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("//span[@ class='google-symbols NhBTye G47vBd']"));
        un.click();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[1]"));
        search.sendKeys("Rajajinagar");
        Thread.sleep(2000);
        WebElement search1 = driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[2]"));
        search1.sendKeys("Mejestic");
        Thread.sleep(2000);
        WebElement search2 = driver.findElement(By.xpath("(//span[@jstcache='566'])[2]"));
        search2.click();
	}

}
