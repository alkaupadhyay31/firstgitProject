package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AssertionExtentReport {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
		
		
		@BeforeClass
		public void reportconfig() {
			
			
			report = new ExtentReports("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\Selenium_Project\\report2.html");
			
			test = report.startTest("HerokuLoginTest"); 
			
			}
		
		@Test(priority = 1)
		public void start() throws InterruptedException {
			driver = new ChromeDriver();
			test.log(LogStatus.PASS, "Chrome browser opened successfully");
			
			
			
	     	driver.get("https://the-internet.herokuapp.com/login");
	     	if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/login")) {
				
				 test.log(LogStatus.PASS, "URL loaded successfully");
				
			}else
				
				test.log(LogStatus.FAIL, "URL loaded unsuccessful"); 
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			test.log(LogStatus.PASS, "maximised browser");
			
//			hard assertion
			String Actualurl = driver.getCurrentUrl();
			String Expectedurl = "https://the-internet.herokuapp.com/login";
			Assert.assertEquals(Actualurl,Expectedurl);
		
			
//			soft assertion
			SoftAssert sa = new SoftAssert();
			String Actualurl1 = driver.getCurrentUrl();
			String Expectedurl1 = "https://the-internet.herokuapp.com/login";
			sa.assertEquals(Actualurl1, Expectedurl1);
			 
			 sa.assertAll();
			 
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//			test.log(LogStatus.PASS, "Username Textfield clicked successfully");
//			test.log(LogStatus.PASS, "Text entered successfully");
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//	        test.log(LogStatus.PASS, "Text entered successfully");
//	        
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//	        test.log(LogStatus.PASS, "Login button clicked successfully");      
//	       
//	        
//	       
//	        Thread.sleep(2000);
//	        driver.close();
			
	        }
		
		@Test (priority = 2)
		public void enterusername() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
			test.log(LogStatus.PASS, "Username Textfield clicked successfully");
			test.log(LogStatus.PASS, "Text entered successfully");
	        Thread.sleep(2000);
		}
	        
	    @Test(priority = 3)
	    public void enterPassword() {
	    	
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
	        test.log(LogStatus.PASS, "Text entered successfully");
//	        Thread.sleep(2000);
	      }
	    @Test(priority = 4)
	    public void click() throws InterruptedException {
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	        test.log(LogStatus.PASS, "Login button clicked successfully");
	       
	        Thread.sleep(2000);
	        
	        driver.close();
	    }
	       


		
//		@AfterMethod
//		public void teardown() {
//			
//			driver.close();
//			
//		}
		
		@org.testng.annotations.AfterClass
		public void reportflush() {
			
			report.endTest(test);
			
			report.flush();
			
		}
		}

