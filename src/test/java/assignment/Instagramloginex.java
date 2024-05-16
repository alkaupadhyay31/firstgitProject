package assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramloginex {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\Selenium_Project\\src\\test\\resources\\testdata1\\testdata1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
		
		
			
	}

}
