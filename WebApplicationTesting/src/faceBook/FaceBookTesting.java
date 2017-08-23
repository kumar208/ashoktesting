package faceBook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FaceBookTesting
{

	@Test
	public void facebookLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		Sleeper.sleepTightInSeconds(10);
		
		driver.close();
	}
	
	
}
