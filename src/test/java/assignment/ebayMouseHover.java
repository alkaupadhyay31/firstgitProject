package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ebayMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
//		Creating a actions object
		Actions action = new Actions(driver);
//		call mouseHover
		WebElement electronics = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("(//a[text()='Fashion'])[2]"));
		Thread.sleep(2000);
		WebElement electronics1 = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Thread.sleep(2000);
		WebElement refurbished = driver.findElement(By.xpath("//a[text()='Refurbished']"));
		Thread.sleep(2000);
		
		action.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		action.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		action.moveToElement(electronics1).build().perform();
		Thread.sleep(2000);
		action.moveToElement(refurbished).build().perform();
		Thread.sleep(2000);
		driver.close();

	}

}
