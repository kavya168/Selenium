package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
		@FindBy(id="email")
		private WebElement usn;

		@FindBy(id="pass")
		private WebElement psw;
		
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	    public void Enterusn()
	    {
	    	usn.sendKeys("kavya@gmail.com");
	    }
	    public void Enterpsw()
	    {
	    	psw.sendKeys("kavya@123");
	    }
	    
	}


