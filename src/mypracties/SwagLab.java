package mypracties;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.id("login_credentials"));
		System.out.println(log.getText());
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("user-name"));
		usn.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.xpath("//div[@class='login_password']"));
		System.out.println(psw.getText());
		Thread.sleep(2000);
		WebElement psw1 = driver.findElement(By.id("password"));
		psw1.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		Thread.sleep(2000);
		List<WebElement> prod = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		int count = prod.size();
		for(int i=0; i<count; i++)
		{
		  WebElement p = prod.get(i);
		  if(i==0)
		  {
			  Thread.sleep(2000);
		    p.click();
		    break;
		  }
		else
		{
			  System.out.println("not click");
		}
		
	 }
		Thread.sleep(2000);
		WebElement pname1 = driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		String bcart1 = pname1.getText();
		System.out.println(bcart1);
		 Thread.sleep(2000);
		WebElement prate1 = driver.findElement(By.xpath("//div[contains(text(),'$')]"));
		String bcart2 = prate1.getText();
		System.out.println(bcart2);
		  String re = prate1.getText();
		  String bcart3 = re.toString().replace("$", " ");
		  System.out.println(bcart3);
		 Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		add.click();
		 Thread.sleep(2000);
		WebElement addbutton = driver.findElement(By.id("shopping_cart_container"));
		addbutton.click();
		 Thread.sleep(2000);
		WebElement pname2 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String acart1 = pname2.getText();
		System.out.println(acart1);
		 Thread.sleep(2000);
		WebElement prate2 = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		String acart2 = prate2.getText();
		System.out.println(acart2);
		 Thread.sleep(2000);
		 WebElement button2 = driver.findElement(By.xpath("//button[.='Open Menu']"));
		button2.click();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		driver.quit();
		
	}

}
