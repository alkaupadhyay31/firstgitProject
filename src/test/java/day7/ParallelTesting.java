package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void chromeTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.findElement(By.linkText("Pricing")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void firefox() throws InterruptedException {
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://zerodha.com/");
		driver1.findElement(By.linkText("Pricing")).click();
		Thread.sleep(2000);
		driver1.close();
		
	}
	
	@Test
	public void Edge() throws InterruptedException {
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://zerodha.com/");
		driver2.findElement(By.linkText("Pricing")).click();
		Thread.sleep(2000);
		
		driver2.close();
	}

}
