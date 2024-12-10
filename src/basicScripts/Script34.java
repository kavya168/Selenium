package basicScripts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script34 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/Hp/Desktop/HTML/Dropdown.html");
		WebElement dd = driver.findElement(By.id("celebrities"));
		Select s =new Select(dd);
		List<WebElement> op = s.getOptions();
		 int count = op.size();
	      System.out.println(count);
	      ArrayList<String> arr= new ArrayList<String>();
		 for(int i=0;i<count;i++)
		 {
			 WebElement option = op.get(i);
			 String opt = option.getText();
			 arr.add(opt);
			 System.out.println(opt); 
		 }
		 Collections.sort(arr);
		 for(String ar:arr)
		 {
			 
			 System.out.println(ar);
		 }
		 Collections.sort(arr,Collections.reverseOrder());
		 for(String ar1:arr)
		 {
			 
			 System.out.println(ar1);
		 }
		 
		 Thread.sleep(2000);
		 driver.close();
	}

	}


