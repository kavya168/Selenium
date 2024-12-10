package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 {

	public Script05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 Thread.sleep(300);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(100);
        WebElement un = driver.findElement(By.id("inputUsername"));
        un.sendKeys("kavya");
        Thread.sleep(2000);
        WebElement pwd= driver.findElement(By.name("inputPassword"));
        pwd.sendKeys("kavya@122");
        Thread.sleep(2000);
        WebElement login= driver.findElement(By.xpath("//button[.='Sign In']"));
        login.click();
        Thread.sleep(2000);
        WebElement forgot= driver.findElement(By.xpath("//a[.='Forgot your password?']"));
        forgot.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.cssSelector("input[type='text']"));
        name.sendKeys("kavya");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        email.sendKeys("kavya123@gmail.com");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.cssSelector("input[placeholder='Phone Number']"));
        phone.sendKeys("7890076535");
        Thread.sleep(2000);
        WebElement re= driver.findElement(By.xpath("//button[.='Reset Login']"));
        re.click();
        Thread.sleep(2000);
        WebElement text= driver.findElement(By.tagName("p"));
        Thread.sleep(2000);
         String t = text.getText();
         System.out.println(t);
         Thread.sleep(2000);
        WebElement go= driver.findElement(By.xpath("//button[.='Go to Login']"));
        go.click();
        Thread.sleep(2000);
        un.sendKeys("kavya");
        Thread.sleep(2000);
        pwd.sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        login.click();
        
        
        
           

	}

}
