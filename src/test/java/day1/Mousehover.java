package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
//		create object
		
		Actions act = new Actions(driver);
		
//		call mouseHover()
		WebElement Gardenlink = driver.findElement(By.linkText("Home & Garden"));
		WebElement Selllink = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1388.l3250'])[1]"));
		WebElement Equipment = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1385.l3250'])[1]"));
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		Thread.sleep(2000);
		act.moveToElement(Gardenlink).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Selllink).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Equipment).build().perform();
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Smartphones and accessories']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
