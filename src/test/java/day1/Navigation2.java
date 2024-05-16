package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
	    driver.findElement(By.xpath("//a[text()='register']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@for='personalaccount-radio']")).click();
	    Thread.sleep(1000);
        driver.findElement(By.id("firstname")).sendKeys("Alka");
        Thread.sleep(1000);
        driver.findElement(By.id("lastname")).sendKeys("Upadhyay");
        Thread.sleep(1000);
       driver.findElement(By.id("Email")).sendKeys("alkaupadhyay31@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Khush600al01");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@name='EMAIL_REG_FORM_SUBMIT']")).click();
        Thread.sleep(1000);
        driver.close();
		// TODO Auto-generated method stub

	}

}
