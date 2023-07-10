package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readmultipledatafromexcel {

	
	
	public static void main(String[] args) throws  IOException, InterruptedException {
		
		
	for(int i=1;i<=10;i++)
	{
		
		
		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);//file ready to read the file 
		
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		
		Row row = sheet.getRow(i);//get into the desired row
		
		Cell cell = row.getCell(0);//get into the desired cell/column 
		
		String data = cell.getStringCellValue();//read the value for call
		 
		Thread.sleep(2000);
		
		System.out.println(data);
		 
	}	 
	
	}
}
