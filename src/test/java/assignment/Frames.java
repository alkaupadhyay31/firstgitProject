package assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Frames");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']")));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nested Frames");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();

	}


}