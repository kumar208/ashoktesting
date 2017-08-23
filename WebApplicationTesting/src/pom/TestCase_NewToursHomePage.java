package pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase_NewToursHomePage
{

	@Test
	public void HomePageAutomation()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelComeMercuryTours WMT = PageFactory.initElements(driver, WelComeMercuryTours.class);
		
		WMT.Destination();
		driver.navigate().back();
		
		WMT.Registerr();
		driver.navigate().back();
		
		WMT.Salon();
		
		
	}
	
}
