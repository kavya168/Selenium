package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("browNotButton")).click();
	}

}
