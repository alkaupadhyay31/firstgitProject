package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	@Test
	public void zerodha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		Assert.assertEquals(actualtitle,expectedtitle);
	}

}
