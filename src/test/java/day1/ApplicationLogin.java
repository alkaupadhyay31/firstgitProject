package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bottledapp.com/auth/login");
	    driver.findElement(By.id("field-2")).sendKeys("alkaupadhyay33@gmail.com");
	    driver.findElement(By.id("field-3")).sendKeys("123456gjkk");
//        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//button[text()='Enter']")).click();

	}

}
