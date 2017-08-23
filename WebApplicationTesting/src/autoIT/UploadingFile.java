package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFile {

	public static void main(String[] args) throws IOException
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com/");
		
		driver.findElement(By.id("create-dropdown-button")).click();
		driver.findElement(By.className("upload-subitem")).click();
		
		driver.findElement(By.className("browse-btn")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Shiva\\Desktop\\FileUpload.exe");

	}

}
