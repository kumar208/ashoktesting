package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingAlert_TSRTC {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert at = driver.switchTo().alert();
		
		System.out.println(at.getText());
		
		Sleeper.sleepTightInSeconds(5);
		
		at.accept();// clicks on Ok Button
		
		//at.dismiss(); // clicks on Cancel button
		
		driver.close();

	}

}
