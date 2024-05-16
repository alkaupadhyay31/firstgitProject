package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	    driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//*[text()=' Login']")).click();
	 
	    
	    
	    
		// TODO Auto-generated method stub

	}

}
