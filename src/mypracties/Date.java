package mypracties;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		java.util.Date d=new java.util.Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm =new File("./kavya/kavya.png");
		FileHandler.copy(temp, perm);
	
	}

}
