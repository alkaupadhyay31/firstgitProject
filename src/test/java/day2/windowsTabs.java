package day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsTabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String singleHandle : allHandles) {
			
			driver.switchTo().window(singleHandle);
			if(driver.getTitle().equals("QAClick Academy - A Testing Academy to Learn, Earn and Shine")) {
				
			break;
			}
		}
        driver.findElement(By.linkText("Access all our Courses")).click();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("autocomplete")).sendKeys("Switch back to my parent window");
	}

}
