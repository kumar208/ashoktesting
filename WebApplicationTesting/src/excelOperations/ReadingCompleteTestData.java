package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleteTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shiva\\Desktop\\AshokTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int RowCount =ws.getLastRowNum(); // find total Rows in a Sheet
		
		for(int i=0;i<=RowCount;i++)// Row
		{
			Row r =ws.getRow(i); // Goes to each and Every Row
			int colCount =r.getLastCellNum(); // finding Row of total Cell count
			
			for(int j=0;j<colCount;j++) // Cell
			{
				Cell c =r.getCell(j); // goes to each Row of Each Cell
				String Data=c.getStringCellValue();
				System.out.print(Data+"  ");
			}
			
			System.out.println();
			
		}

	}

}
