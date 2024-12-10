package mypracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));	
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.xpath("//p[.='Admin@gmail.com']"));
        String em = usn.getText();
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        WebElement f2 = driver.findElement(By.xpath("//div[@class='form_container']"));	
		driver.switchTo().frame(f2);
        WebElement email=driver.findElement(By.id("email"));
        Thread.sleep(2000);
        email.sendKeys(em);
        
	}
}
