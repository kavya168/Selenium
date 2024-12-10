package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String vlaue="./softwares/chromedriver.exe";
		System.setProperty(key, vlaue);
		ChromeDriver driver=new ChromeDriver();
	
		String key1="webdriver.gecko.driver";
		String vlaue1="./softwares/geckodriver.exe";
		System.setProperty(key1, vlaue1);
		FirefoxDriver driver1=new FirefoxDriver();

	}

}

