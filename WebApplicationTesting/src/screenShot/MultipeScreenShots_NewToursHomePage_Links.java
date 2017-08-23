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

public class MultipeScreenShots_NewToursHomePage_Links {

	public static void main(String[] args) throws IOException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(linkName);
			links.get(i).click();
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Shiva\\Desktop\\NewToursScreenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			
			
		}
		
		driver.close();
		
		
		
		
	}

}
