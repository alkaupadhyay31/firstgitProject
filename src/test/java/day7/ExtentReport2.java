package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport2 {
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeClass
	public void reportconfiguration() {
		
		reports = new ExtentReports("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\Selenium_Project\\rep2.html");
	     test = reports.startTest("Ebay test");
	}
	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
		test.log(LogStatus.PASS, "Chrome browser opened successfully");
		 System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "maximised browser");
		
		
		driver.get("https://www.ebay.com/");
		if(driver.getCurrentUrl().equals("https://www.ebay.com/")) {
			
			 test.log(LogStatus.PASS, "URL loaded successfully");
			
		}else
			
			test.log(LogStatus.FAIL, "URL loaded unsuccessful"); 
		}
	@Test
	public void test1() throws InterruptedException {
//        Actions act = new Actions(driver);
		
//		call mouseHover()
		driver.findElement(By.linkText("Home & Garden")).click();
		test.log(LogStatus.PASS, "linktext shows option");
		
		
		
		
	}
//		WebElement Selllink = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1388.l3250'])[1]"));
//		
//		WebElement Equipment = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1385.l3250'])[1]"));
//		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
//		Thread.sleep(2000);
//	    act.moveToElement Gardenlink.build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(Selllink).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(Equipment).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(Electronics).build().perform();
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[text()='Smartphones and accessories']")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//    	Thread.sleep(2000);
//		driver.close();
		
		
		
	
	@AfterMethod 
	public void tearDown() {
//		driver.navigate().back();
		driver.close();
		
	}
	
	@org.testng.annotations.AfterClass
	public void reportflush() {
		
		reports.endTest(test);
		
		reports.flush();
		
	}
	
}	



