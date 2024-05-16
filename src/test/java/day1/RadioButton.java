package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> radiobuttons =driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement radiobutton : radiobuttons) {
			radiobutton.click();
		}
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
