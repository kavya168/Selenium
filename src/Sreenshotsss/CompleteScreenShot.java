package Sreenshotsss;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	    Date d= new Date(0);
	    String d1 = d.toString().replace(":", "-");
	    System.out.println(d1);
	    TakesScreenshot ts= (TakesScreenshot)driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File perm =new File("./Screenshots/flipkartpage.png");
	    org.openqa.selenium.io.FileHandler.copy(temp, perm);
	    Thread.sleep(2000);
	    driver.close();
	    

	}

}
