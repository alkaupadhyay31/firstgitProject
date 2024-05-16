package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCountry {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("Argentina");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Argentina'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Argentina'])[1]")));
		driver.findElement(By.xpath("//div[text()='Argentina' and @class='ui-menu-item-wrapper']")).click();
		// TODO Auto-generated method stub

	}

}
