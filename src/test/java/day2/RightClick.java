package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClick	= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions ac = new Actions(driver);
        ac.contextClick(rightClick).build().perform();
        
        
	}

}
