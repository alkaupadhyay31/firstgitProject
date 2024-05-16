package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		// TODO Auto-generated method stub

	}

}
