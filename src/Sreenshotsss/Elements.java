package Sreenshotsss;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Elements {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	    Date d =new Date(1);
	    String d1 = d.toString().replace(":", "-");
	    System.out.println(d1);
	    WebElement usn = driver.findElement(By.id("email"));
	    File temp = usn.getScreenshotAs(OutputType.FILE);
	    File perm = new File("./Screenshots/Elementfile.png");
	    FileHandler.copy(temp, perm);
	    Thread.sleep(2000);
	    driver.close();
	    

	}

}
