package Datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteMultipleData {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int countoflinks = links.size();
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("FlipkartLinks");
		for(int i=0;i<countoflinks;i++)
		{
			 WebElement link = links.get(i);
			 String url = link.getAttribute("href");
			 XSSFRow row = sheet.createRow(i);
			 XSSFCell cell = row.createCell(0);
			 cell.setCellValue(url);
		}
		FileOutputStream file =new FileOutputStream("./TestData/FlipkartLinks.xlsx");
		book.write(file);
		book.close();
		file.close();

	}

}
