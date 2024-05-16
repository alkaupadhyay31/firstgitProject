package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
WebDriver driver;
	
	// in @beforetest i write all my pre conditions
	
	@BeforeMethod
	public void setup() {
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test (dataProvider = "datap")
	public void test1(String Username , String Password) throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name="datap")
	public Object[][] datap() {
		
		return new Object[][]
				{
			new Object[] { "Admin", "admin123" }, 
			new Object[] { "Admin", "adddmmiiinn" },
			new Object[] { "username", "admin123" },
			new Object[] { "operator", "password" },
			new Object[] { "admmin" ,  "reverse" },
							
				
				};		
	
	}
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
	}
}


