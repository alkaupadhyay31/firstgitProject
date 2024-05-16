package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.Striped;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	    String text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[9]//td[contains(text(),'Python')]")).getText();
		
		if(text.contains("Python")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
