package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Hp/Desktop/HTML/webpage4.html");
		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				usn.sendKeys("admin");
			}
			else
			{
				System.out.println("usn is disabled");
			}
		}
		else
		{
			System.out.println("usn is not displayed");
		}
		WebElement psw = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		if(psw.isDisplayed())
		{
			if(psw.isEnabled())
			{
			  psw.sendKeys("admin@123");
			}
			else
			{
				System.out.println("psw is disabled");
			}
		}
		else
		{
			System.out.println("psw is not displayed");
		}
		WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("it is not selected");
					cb.click();
				}
			}
				else
				{
					System.out.println("it is not enabled");
				}
			}
		else
		{
			System.out.println("it is not displayed");
		}
	}
}
