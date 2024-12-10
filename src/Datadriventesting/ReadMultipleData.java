package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {

	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream("./TestData/Facebook credential.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lr = sheet.getLastRowNum();
		for(int i=0;i<=lr;i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell1 = row.getCell(0);
			String c1val = cell1.getStringCellValue();
			XSSFCell cell2 = row.getCell(1);
			String c2val = cell2.getStringCellValue();
			System.out.println(c1val+" "+c2val);
		}
		book.close();
		file.close();

	}

}
