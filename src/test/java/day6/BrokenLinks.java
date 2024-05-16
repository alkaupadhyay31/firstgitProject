package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		//since all the links are developed using a tag.
		
		// we will use by.tagname to get all the links
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println("total links in ebay.com is"+links.size());
		
		for (WebElement link : links) {
			
			
			String url = link.getAttribute("href");
			
			try {
			
			if(url!=null) {
				
				driver = new ChromeDriver();
				
				driver.get(url);
				
				//check the title
				if(driver.getTitle().equalsIgnoreCase("not found")||driver.getTitle().isEmpty())
					
					System.out.println("Broken link"+url);
					
				else
					
					System.out.println("valid link"+url);
							
				
			}
			else
				
				System.out.println("Its a broken link"+url);
			}
			
			catch (Exception e) {
			
				// TODO: handle exception
			}
			driver.close();
		}
		
		driver.quit();
		
		

	}

}
