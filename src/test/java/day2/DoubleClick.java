package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement DoubleClick	= driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions ac = new Actions(driver);
        ac.contextClick(DoubleClick).build().perform();
	

	}

}
