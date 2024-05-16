package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
//		click on datepicker to open the calender
		driver.findElement(By.xpath("//input[@class='form-control is-datepick']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='datepick']"))));
		driver.findElement(By.cssSelector(".datepick-month-year")).click();
		
//		String currentmonth = driver.findElement(By.xpath("//select[@title='Change the month']")).getText();
//		String currentyear = driver.findElement(By.xpath("//select[@title='Change the year']")).getText();
//		
////		for selecting month
//		while(!(currentmonth.equals("August") && currentyear.equals("2026"))) {
//		
////		for clicking on next
//		driver.findElement(By.cssSelector(".datepick-cmd-next ")).click();
////		New month and year value storing in variables
//		 currentmonth = driver.findElement(By.xpath("//select[@title='Change the month']")).getText();
//	     currentyear = driver.findElement(By.xpath("//select[@title='Change the year']")).getText();
//		}
//		
//		driver.findElement(By.xpath("//a[text()='21']")).click();
//		

	}

}
