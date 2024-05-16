package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
WebDriver driver;
	
	// in @beforetest i write all my pre conditions
	
	@BeforeTest (alwaysRun = true)
	public void setup() {
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	}
	
	@Test (groups = "smoke",priority = 1)
	public void sendkeystest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Hii there!");
		Thread.sleep(2000);
	}
	
	@Test (groups = "regression",priority = 3)
	public void webtabletest() throws InterruptedException {
		String num = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[7]/td[3]")).getText();
		
		System.out.println(num);	
		
		Thread.sleep(2000);
		
	}
	
	@Test (groups = "smoke",priority=2)
	public void checkbox() {
		driver.findElement(By.name("checkBoxOption1")).click();
	}
	
	@Test (groups = "regression",priority = 4 )
	public void linktext() {
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();

	}
		
	
	
	
	

	@AfterTest (alwaysRun = true)
	public void teardown() {
		
		driver.close();
		
	}
}
