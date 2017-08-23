package mouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FlipKart_Electronics_MouseHover {

	public static void main(String[] args) 
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement Electronics=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
		
		act.moveToElement(Electronics).perform();
		
		Sleeper.sleepTightInSeconds(5);
		
	WebElement	SamSung=driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
		SamSung.click();
		
		

	}

}
