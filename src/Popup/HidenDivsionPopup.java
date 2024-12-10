package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDivsionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='26']")).click();

	}

}
