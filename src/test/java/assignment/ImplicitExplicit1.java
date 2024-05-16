package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit1 {
	static WebDriver driver;
	public static void click (int number) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File file1 = ss .getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\alkau\\Pictures\\Screenshots"+ number + ".png");
		
		FileUtils.copyFile(file1,  file2);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
	    driver = new ChromeDriver();
	    
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
        wait.until(ExpectedConditions.urlMatches("https://www.ebay.com/"));
        
        wait.until(ExpectedConditions.titleContains("Electronics, Cars, Fashion, Collectibles & More | eBay"));
        
		driver.manage().window().maximize();
		
		click(1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("gh-ac")));
        
		driver.findElement(By.id("gh-ac")).sendKeys("Shoes");
		
		Thread.sleep(2000);
		
		click(2);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-btn")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-btn")));
		
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(2000);
		
		click(3);
		
//		js.executeScript("document.getElementById('gh-ac').value='Shoes'");
//		js.executeScript("document.getElementById('gh-btn').click()");
		
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(2000);
		
		click(4);
		
		js.executeScript("window.scrollBy(0,-4000)");
		
		Thread.sleep(2000);
		
	    js.executeScript("window.scrollBy(0,-4000)");
	    
	    Thread.sleep(2000);
	    
	    click(5);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
	    
	    driver.findElement(By.id("gh-ac")).clear();
	    
	    click(6);
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    
}
}