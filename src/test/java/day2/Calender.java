package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
//		click on date to open the calender
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String actualmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		String actualyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		
//		for selecting month
		while(!(actualmonth.equals("December")&& actualyear.equals("2026"))) {
			
//			clicking on next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			actualmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			actualyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			}
		    driver.findElement(By.xpath("//a[text()='17']")).click();
		
		
		

	}

}
