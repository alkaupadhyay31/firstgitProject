package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ParallelTesting2 {
	
	@Test
	public void chromeTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
     	driver.get("https://the-internet.herokuapp.com/login");
     	driver.manage().window().maximize();
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
     	driver1.manage().window().maximize();
//		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//        Thread.sleep(2000);
        driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//        Thread.sleep(2000);
        driver1.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//        Thread.sleep(2000);
        driver1.close();
        }
	
	@Test
	public void firefoxTest() throws InterruptedException {
		WebDriver driver2 = new FirefoxDriver();
     	driver2.get("https://the-internet.herokuapp.com/login");
     	driver2.manage().window().maximize();
//		Thread.sleep(2000);
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//        Thread.sleep(2000);
        driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//        Thread.sleep(2000);
        driver2.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//        Thread.sleep(2000);
        driver2.close();
        }
	
//	@Test
//	public void ieTest() throws InterruptedException {
//		WebDriver driver3 = new InternetExplorerDriver();
//     	driver3.get("https://the-internet.herokuapp.com/login");
//     	driver3.manage().window().maximize();
////		Thread.sleep(2000);
//		driver3.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
////        Thread.sleep(2000);
//        driver3.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
////        Thread.sleep(2000);
//        driver3.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
////        Thread.sleep(2000);
//        driver3.close();
//        }

}
