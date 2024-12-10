package TestNG;

import org.testng.annotations.Test;

public class Script3 {
private static final boolean flase = false;
@Test(priority = 0)
public void signup()
{
	System.out.println("signup is successfull");
}
@Test(priority = 1)
public void login()
{
	System.out.println("login is successfull");
}
@Test(enabled = flase)
public void homepage()
{
	System.out.println("homepage is successfull");
}
@Test(priority = 2)
public void logout()
{
	System.out.println("logout is successfull");
}
}
