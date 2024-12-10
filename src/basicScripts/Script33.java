package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script33 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/Hp/Desktop/HTML/Dropdown.html");
		WebElement dd = driver.findElement(By.id("celebrities"));
		Select s =new Select(dd);
		List<WebElement> op = s.getOptions();
		 int count = op.size();
	      System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 WebElement option = op.get(i);
			 String opt = option.getText();
			 System.out.println(opt);
			 
		 }
	}

}
