package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/nested-iframes");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//iframe[@src='/selenium/nested-iframe1']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']")));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//iframe[@src='/selenium/nested-iframe1']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		driver.findElement(By.xpath("//button[@class='ui inverted red button']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
		driver.findElement(By.xpath("//button[@class='ui inverted green button']")).click();
		 
		 

		

	}

}
