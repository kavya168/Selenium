package basicScripts;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script4 {

	public static void main(String[] args) {
		String key3="webdriver.IEDriver.Server";
		String value3="./softwares/IEDriverServer.exe";
		System.setProperty(key3, value3);
        InternetExplorerDriver driver=new InternetExplorerDriver();
	}
}

