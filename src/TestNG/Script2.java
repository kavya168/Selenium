package TestNG;

import org.testng.annotations.Test;

public class Script2 
{
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
	@Test(priority = 2)
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("logout is successfull");
	}
}
