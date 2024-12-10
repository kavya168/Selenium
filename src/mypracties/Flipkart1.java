package mypracties;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Flipkart1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(30,90);
		driver.manage().window().setSize(d);
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(100, 100);
		driver.manage().window().setPosition(p);
		
	}

}
