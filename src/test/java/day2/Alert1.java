package day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("simple")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(4000);
//		Alert al = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
//		al.sendKeys("Alka");
//		Thread.sleep(4000);
//		driver.switchTo().alert().accept();
		driver.close();
		
//		al.sendKeys("Alka");
//		Thread.sleep(4000);
//		al.dismiss();
		
		
		

	}

}
