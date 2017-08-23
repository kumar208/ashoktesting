package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingScreenShot
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		
	}
	
	@Test
	public void ScreenShot() throws IOException
	{
		Sleeper.sleepTightInSeconds(10);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Shiva\\Desktop\\Bing.png"));
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
	
}
