package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//a[@class='rdcSelectedBus site-links']")).click();
//	    driver.findElement(By.id("src")).sendKeys("Hello Buses");
//	    driver.findElement(By.id("dest")).sendKeys("Indiana");
//	    driver.findElement(By.id("onward_cal")).click();
//	    driver.findElement(By.tagName("span")).click();
//	    driver.findElement(By.id("r-date")).click();
//	    driver.findElement(By.tagName("span")).click();
//	    
//	    
	    
	    
	    
//	    driver.findElement(By.tagName("a")).click();
	    Thread.sleep(1000);
		// TODO Auto-generated method stub

	}

}
