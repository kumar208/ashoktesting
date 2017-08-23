package testNgAnnoations;

import org.testng.annotations.Test;

public class Annoations1
{
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch a Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("LogIn to Gmail Application");
	}
	
	@Test(priority=3)
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@Test(enabled=false)
	public void compose()
	{
		System.out.println("Testing Compose mail ");
	}
	
}
