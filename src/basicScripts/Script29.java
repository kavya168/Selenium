package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script29 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
        WebElement src = driver.findElement(By.id("box5"));
        WebElement des = driver.findElement(By.id("box105"));
        WebElement src1 = driver.findElement(By.id("box6")); 
        WebElement des1 = driver.findElement(By.id("box106"));
        WebElement src2 = driver.findElement(By.id("box1"));
        WebElement des2 = driver.findElement(By.id("box101"));
        WebElement src3 = driver.findElement(By.id("box3"));
        WebElement des3= driver.findElement(By.id("box103"));
        WebElement src4 = driver.findElement(By.id("box4"));
        WebElement des4 = driver.findElement(By.id("box104"));
        WebElement src5 = driver.findElement(By.id("box2"));
        WebElement des5 = driver.findElement(By.id("box102"));
        WebElement src6 = driver.findElement(By.id("box7"));
        WebElement des6 = driver.findElement(By.id("box107"));
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.dragAndDrop(src, des).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src1, des1).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src2, des2).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src3, des3).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src4, des4).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src5, des5).perform();
        Thread.sleep(2000);
        a.dragAndDrop(src6, des6).perform();

	}

}
