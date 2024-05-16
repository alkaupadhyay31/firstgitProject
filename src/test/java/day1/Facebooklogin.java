package day1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Facebooklogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\Selenium_Project\\src\\test\\resources\\testdata\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String email = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		
			
			
			
	}		
		
}
