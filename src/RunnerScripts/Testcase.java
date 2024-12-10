package RunnerScripts;

import org.testng.annotations.Test;

import GenericScript.BasePage;
import PageObject.LoginPage;


public class Testcase extends BasePage
{
@Test
  public void Login() throws InterruptedException
  {
	  LoginPage lp =new LoginPage(driver);
	  Thread.sleep(2000);
	  lp.Enterusn();
	  Thread.sleep(2000);
	  lp.Enterpsw();
	  Thread.sleep(2000);
//	  driver.navigate().refresh();
//	  Thread.sleep(2000);
//	  lp.Enterusn();
//	  Thread.sleep(2000);
//	  lp.Enterpsw();
  }
}
