package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script35 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/r.php");
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<count;i++)
		{
			WebElement sort = opt.get(i);
			String text = sort.getText();
			arr.add(text);
			System.out.println(text);
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
