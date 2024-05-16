package day7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit2 {
WebDriver driver;
	
	@Before
	public void setup() {
		
		 driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys("This batch is Awesome!");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		String num = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[7]/td[3]")).getText();
		
		System.out.println(num);	
		
		Thread.sleep(2000);
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
		
	}
	

}
