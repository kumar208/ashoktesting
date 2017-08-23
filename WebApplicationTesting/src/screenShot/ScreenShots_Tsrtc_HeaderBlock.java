package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenShots_Tsrtc_HeaderBlock {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock= driver.findElement(By.className("menu-wrap"));
		List<WebElement>Headerlinks= HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(Headerlinks.size());
		
		for(int i=0;i<Headerlinks.size();i++)
		{
			String linkName=Headerlinks.get(i).getText();
			System.out.println(linkName);
			
			Headerlinks.get(i).click();
			
			File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Shiva\\Desktop\\TsrtcScreenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			HeaderBlock= driver.findElement(By.className("menu-wrap"));
			Headerlinks= HeaderBlock.findElements(By.tagName("a"));
			
			
		}
		
		driver.close();

	}

}
