package mypracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bookticket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
	    driver.findElement(By.id("txtOriginGeneral")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='select2-result-label'])[7]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtDestinationGeneral")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='select2-result-label'])[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtDepartDateBooking")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='20']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtReturnDateBooking")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='23']")).click();
	    driver.findElement(By.id("btnBusSearchNewGeneral")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//small[.='17'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='16'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='20'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='19'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
	    driver.findElement(By.xpath("//a[.='OK']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='17'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='16'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='20'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//small[.='19'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
	    Thread.sleep(2000);
	   WebElement name = driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']"));
	    name.sendKeys("kavya");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']")).sendKeys("7975276382");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']")).sendKeys("kavyadv@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnNext")).click();
	    Thread.sleep(5000);
	    driver.close();
	}

}
