package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
//		click on datepicker to open the calender
		driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"))));
	    
		
		String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
//		for selecting month
		while(!(currentmonth.equals("October") && currentyear.equals("2001"))) {
		
//		for clicking on next
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
//		New month and year value storing in variables
		 currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	     currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("//a[text()='31']")).click();
		

	}

}
