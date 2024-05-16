package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Keys {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		Actions ac = new Actions(driver);
		ac.keyDown(username,org.openqa.selenium.Keys.SHIFT).sendKeys("alka").keyUp(username,org.openqa.selenium.Keys.SHIFT).build().perform();
		ac.keyDown(password,org.openqa.selenium.Keys.SHIFT).sendKeys("upadhyay").keyUp(username,org.openqa.selenium.Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		ac.keyDown(password,org.openqa.selenium.Keys.BACK_SPACE).keyUp(password,org.openqa.selenium.Keys.BACK_SPACE).build().perform();

	}

}
