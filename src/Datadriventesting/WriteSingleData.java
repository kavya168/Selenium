package Datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("AutomationFramework");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Automationclass");
		FileOutputStream file= new FileOutputStream("./TestData/Framework.xlsx");
		book.write(file);
		book.close();
		file.close();

	}

}
