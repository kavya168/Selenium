package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script36 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		 Thread.sleep(5000);
		 WebElement multi = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		 Select s= new Select(multi);
		   Thread.sleep(2000);
		   s.selectByIndex(0);
		   Thread.sleep(2000);
		   s.selectByIndex(2);
		   Thread.sleep(2000);
		   s.selectByIndex(4);
		   Thread.sleep(2000);
		   s.selectByIndex(6);
		   Thread.sleep(2000);
		   s.selectByIndex(8);
		   Thread.sleep(2000);
		   WebElement add = driver.findElement(By.xpath("//button[.='Add']"));
		   add.click();
		   Thread.sleep(2000);
		   driver.close();
		   
		   
	}

}
