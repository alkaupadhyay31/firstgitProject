package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ebay.com/");
		 
			
		
		}
	@Test
	public void test1() throws InterruptedException {
        Actions act = new Actions(driver);
		
//		call mouseHover()
		WebElement Gardenlink = driver.findElement(By.linkText("Home & Garden"));
		WebElement Selllink = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1388.l3250'])[1]"));
		WebElement Equipment = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1385.l3250'])[1]"));
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		Thread.sleep(2000);
		act.moveToElement(Gardenlink).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Selllink).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Equipment).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Smartphones and accessories']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
//    	Thread.sleep(2000);
//		driver.close();
		
		
		
	}
	@AfterMethod 
	public void tearDown() {
//		driver.navigate().back();
		driver.close();
		
	}
	
	

}
