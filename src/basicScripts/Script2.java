package basicScripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String vlaue="./softwares/geckodriver.exe";
		System.setProperty(key, vlaue);
		FirefoxDriver driver=new FirefoxDriver();
	}	
}