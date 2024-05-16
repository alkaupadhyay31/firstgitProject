package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
//		driver.findElement(By.id("field-2")).click();
	    driver.findElement(By.name("username")).sendKeys("Khusxhiii__");
	    driver.findElement(By.name("password")).sendKeys("ananyaananya");
//        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}
		// TODO Auto-generated method stub

	

}
