package testNgAnnoations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaions3
{

	@BeforeMethod
	public void BrowserLaunchAndNavigateToGmail()
	{
		System.out.println("This is used to launch a Browser and Navigate to Gmail");
	}
	

	@Test(priority=1)
	public void LogIn()
	{
		System.out.println("LogIn to Gmail Application");
	}
	
	@Test(priority=2)
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@Test(priority=3)
	public void compose()
	{
		System.out.println("Testing Compose mail ");
	}
	
	@AfterMethod
	public void ApplClose()
	{
		System.out.println("Closing Application");
	}
	
}
