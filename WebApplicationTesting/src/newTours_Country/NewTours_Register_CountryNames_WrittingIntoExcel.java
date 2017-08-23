package newTours_Country;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames_WrittingIntoExcel {

	public static void main(String[] args) throws IOException {


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames = Country.findElements(By.tagName("option"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shiva\\Desktop\\AshokTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		
		System.out.println(CountryNames.size());
		for(int i=0;i<CountryNames.size();i++)
		{
			Row r =ws.createRow(i);
			Cell c =r.createCell(0);
			
			System.out.println(CountryNames.get(i).getText());
			c.setCellValue(CountryNames.get(i).getText());
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\Shiva\\Desktop\\AshokTestData.xlsx");
			wb.write(file1);
		}
		
		driver.close();

	}

}
