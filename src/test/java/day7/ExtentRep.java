package day7;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRep {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
		
		
		@BeforeClass
		public void reportconfig() {
			
			
			 report = new ExtentReports("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\Selenium_Project\\report1.html");
			
			
		
			
			 test = report.startTest("Rahutshetty"); 
			
			
		}
		
		@BeforeMethod(alwaysRun = true)
		public void setup() {
			 driver = new ChromeDriver();
			
			 test.log(LogStatus.PASS, "Chrome browser opened successfully");
			 System.out.println("Browser opened successfully");
			
			driver.manage().window().maximize();
			 test.log(LogStatus.PASS, "maximised browser");
			
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
			
			if(driver.getCurrentUrl().equals("https://rahulshettyacademy.com/AutomationPractice/#")) {
				
				 test.log(LogStatus.PASS, "URL loaded successfully");
				
			}else
				
				test.log(LogStatus.FAIL, "URL loaded unsuccessful"); 
			
			
		}
		
		@Test(groups = "smoke",priority = 2)
		public void sendkeystest() throws InterruptedException {
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("autocomplete")).sendKeys("This batch is Awesome!");
			 test.log(LogStatus.PASS, "Text entered successfully");
			
		}
		
		@Test(groups = "regression",priority = 3)
		public void webtabletest() throws InterruptedException {
			Thread.sleep(2000);
			String text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[9]/td[2]")).getText();
			
			System.out.println(text);	
			
			
			if(text.contains("Python")) {
				 test.log(LogStatus.PASS, "got the text successfully");
		
			}else
				
					
			 test.log(LogStatus.FAIL, "get text failed");// this will log the message in your report
			
			
		}
		
		@Test(groups = "smoke",priority = 1)
		public void checkbpxtest() {
			
			driver.findElement(By.name("checkBoxOption1")).click();
			 test.log(LogStatus.PASS, "clicked successfully");
			
		}
		
		@Test(groups = "regression",priority = 4) 
		public void linktest() {
			
			WebElement link1 = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
			WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(link1));
			
			
			
			link1.click();
			 test.log(LogStatus.PASS, "link is working and clicked on it");
			
		}
		
	
		@AfterMethod(alwaysRun = true)
		public void teardown() {
			
			driver.close();
			
		}
		
		@org.testng.annotations.AfterClass
		public void reportflush() {
			
			report.endTest(test);
			
			report.flush();
			
		}
		
	}









