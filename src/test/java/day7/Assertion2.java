package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion2 {
	 
	@BeforeTest
	public void start() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Practice Page";
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	
	@Test
	public void checkbox() {
		
	}

}
