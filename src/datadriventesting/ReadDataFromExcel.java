package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./datadriven/Book1.xlsx");

		Workbook wb = null;
		try {
	    wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("Sheet1");
	    
	    Row row = sheet.getRow(0);
	    Cell cell = row.getCell(1);
	    
	    String data = cell.getStringCellValue();
	    System.out.println(data);
		}
		finally {
	    wb.close();
	}
		
	}
}
