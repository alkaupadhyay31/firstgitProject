package day6;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\alkau\\Documents\\alka 21.jpg");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));
			
		}
        
	}


