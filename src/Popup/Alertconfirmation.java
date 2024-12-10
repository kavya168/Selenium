package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertconfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.id("buttonAlert1"));
		alert.click();
		Thread.sleep(2000);
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("yes");
		//popup.accept();
		popup.dismiss();
		Thread.sleep(2000);
		driver.quit();

	}

}
