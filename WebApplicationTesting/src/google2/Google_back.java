package google2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_back {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.navigate().back();
		
		driver.close();

	}

}
