package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("./TestData/Facebook credential.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(file);
		XSSFSheet sheet=w.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
	    String val = cell.getStringCellValue();
		Thread.sleep(2000);
	    //System.out.println(val);
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		String val1 = cell1.getStringCellValue();
		System.out.println(val1);
		w.close();
		file.close();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys(val);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(val1);
		WebElement c = driver.findElement(By.xpath("//button[@ type='submit']"));
		c.click();
		
		
		
	}

}
