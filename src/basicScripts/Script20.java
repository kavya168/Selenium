package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com");
		WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
		String att = usn.getAttribute("type");
		System.out.println(att);
		String name = usn.getTagName();
		System.out.println(name);
		String css = usn.getCssValue("line-height");
		System.out.println(css);
		WebElement log = driver.findElement(By.xpath("//div[.='Log in']"));
	   String but = log.getText();
	   System.out.println(but);
	   
	   driver.navigate().to("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		
				
	}

}
