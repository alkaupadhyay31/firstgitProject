package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Upadhyay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9103351204");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("alka3110");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='31']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Oct']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		
	}

}
