package Sreenshotsss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
    //WebElement link = driver.findElement(By.xpath("//h3[.='6. Use of Public Areas and Content Standards']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	//js.executeScript("arguments[0].scrollIntoView()",link);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("document.body.style.zoom='60%'");
	Thread.sleep(2000);
	js.executeScript("document.body.style.zoom='150%'");
	}
}
