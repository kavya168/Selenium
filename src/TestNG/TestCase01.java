package TestNG;

import org.testng.annotations.Test;

public class TestCase01 extends BaseScripts 
{
       @Test
       public void login()
       {
    	   Loginpage lp =new Loginpage(driver);
    	   lp.Enterusn();
    	   lp.Enterpsw();
       }
}