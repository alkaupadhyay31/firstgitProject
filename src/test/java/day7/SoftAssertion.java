package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void zerodha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "erodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
//		Assert.assertEquals(actualtitle,expectedtitle);
		
//		soft assertion
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(actualtitle,expectedtitle);
		driver.findElement(By.linkText("Signup")).click();
		
		ass.assertAll();
		
		
		
	}

}
