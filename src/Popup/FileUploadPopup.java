package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hp/Desktop/HTML/fileupload.html");
		Thread.sleep(2000);
		WebElement fpop = driver.findElement(By.id("k1"));
		Thread.sleep(2000);
		fpop.sendKeys("C:\\Users\\Hp\\Desktop\\Facebook credential.xlsx");

	}

}
