package testNgAnnoations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
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
	
	
	@AfterTest
	public void ApplClose()
	{
		System.out.println("Closing Application");
	}
	
}
