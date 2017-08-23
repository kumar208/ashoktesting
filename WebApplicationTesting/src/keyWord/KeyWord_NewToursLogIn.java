package keyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyWord_NewToursLogIn 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shiva\\Desktop\\AshokTesting\\WebApplicationTesting\\NewToursLogIn.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath("LogIn")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
