package Sreenshotsss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hp/Desktop/HTML/Disabledelement.html");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('a1').value='hello'" );
		js.executeScript("document.getElementById('a1').value=''" );
		
	}

}
