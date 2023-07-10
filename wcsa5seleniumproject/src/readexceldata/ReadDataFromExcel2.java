package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);		
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(2);
		
		String data = cell.getStringCellValue();
		
		Thread.sleep(2000);
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
