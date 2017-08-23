package excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException
	{
	    FileInputStream file = new FileInputStream("C:\\Users\\Shiva\\Desktop\\AshokTestData2.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(file);
	    XSSFSheet ws = wb.getSheet("Sheet1");
	    
	    Row r = ws.createRow(5);
	    Cell c = r.createCell(10);
	    
	    c.setCellValue("Selenium");
	    
	    FileOutputStream file1 = new FileOutputStream("C:\\Users\\Shiva\\Desktop\\AshokTestData2.xlsx");
	    wb.write(file1);
	    
	        
	    
	    
	    
	    
		
	}

}
