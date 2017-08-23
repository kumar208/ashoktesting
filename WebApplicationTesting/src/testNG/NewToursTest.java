package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursTest 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void ApplicationLaunch()
	{
		 driver  = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		driver.close();
	}
	
}
