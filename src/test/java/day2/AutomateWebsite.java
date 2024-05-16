package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ilaindia.co.in/registration");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='jform_title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='mrs']")).click();
		driver.findElement(By.xpath("//input[@id='jform_first_name']")).sendKeys("Alka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_last_name']")).sendKeys("Upadhyay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='jform_address_r']")).sendKeys("Bari Brahmana , Jammu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_country_r']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_state_r']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_city_r']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_zipcode_r']")).sendKeys("181133");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_mobile']")).sendKeys("9103351204");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_email']")).sendKeys("alkaupadhyay456@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_password1']")).sendKeys("alka20khu01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jform_password2']")).sendKeys("alka20khu01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_plan_id']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Institution']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_zone_id']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Northern Zone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='jform_payment_method']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='PAYUMONEY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
