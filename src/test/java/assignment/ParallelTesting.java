package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void chromeTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
     	driver.get("https://the-internet.herokuapp.com/login");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//        Thread.sleep(2000);
        driver.close();
        }
	@Test
	public void edgetest() throws InterruptedException {
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://the-internet.herokuapp.com/login");
//		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//        Thread.sleep(2000);
        driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//        Thread.sleep(1000);
        driver1.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//        Thread.sleep(2000);
        driver1.close();
        }
	
}