package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TakingScreenShot_Bing {

	public static void main(String[] args) throws IOException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
		
		Sleeper.sleepTightInSeconds(5);
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Shiva\\Desktop\\Bing.png"));
		
		System.out.println("Bing Application ScreenShot");
		
		driver.close();
		
		

	}

}
