package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.findElement(By.xpath("//input[@name='input4[]']")).sendKeys("C:\\Users\\alkau\\Downloads\\notes1.pdf");
	    driver.findElement(By.xpath("//span[text()='Upload']")).click();
//		driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));
			

	}

}
