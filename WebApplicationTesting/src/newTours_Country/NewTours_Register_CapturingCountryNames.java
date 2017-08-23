package newTours_Country;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CapturingCountryNames {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames = Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		for(int i=0;i<CountryNames.size();i++)
		{
			System.out.println(CountryNames.get(i).getText());
		}
		
		driver.close();
		
	}

}
