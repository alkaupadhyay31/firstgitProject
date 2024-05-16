package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle(); 
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String singleHandle : allHandles) {
			
			driver.switchTo().window(singleHandle);
			if(driver.getCurrentUrl().equals("https://elementalselenium.com/")) {
				
			break;
			}
		}
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alkaupadhyay31@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='options']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@value='python']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Send me test automation Pro tips']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(parentHandle);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(2000);
        
        
        
        
	}

}
