package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {
	public static void main (String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    driver.findElement(By.id("checkBoxOption1")).click();
//	    driver.findElement(By.name("checkBoxOption1")).click();
//	    driver.findElement(By.className("blinkingText")).click();
//	    driver.findElement(By.className("Home")).click();
//		explicit wait 
//		create a object
		
	    WebElement link1 = (WebElement) driver.findElements(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(link1));
	    link1.click();
	    
	
	

	}
}