package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownLoadFile {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		
		driver.findElement(By.linkText("Download")).click();
		
		driver.findElement(By.linkText("3.5.0")).click();
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Shiva\\Desktop\\DownLoadFile.exe");

	}

}
