package day7;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	WebDriver driver;
	@Before
	public void start() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Frames");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	}
	
	
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']")));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nested Frames");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	@After
	public void teardown() {
		driver.quit();
		
	}
	
	
	    
	    
	    
		
		
		
		
	
	}


