package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./datadriven/Book1.xlsx");

		Workbook wb = null;
		try {
	    wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("Sheet1");
	    
	    Row row = sheet.createRow(3);
	    Cell cell = row.createCell(0);
	    
	    cell.setCellValue("#####");
	    
	    FileOutputStream fos = new FileOutputStream("./datadriven/Book1.xlsx");
	    wb.write(fos);
		}
		finally {
	    wb.close();
}
	}
}

