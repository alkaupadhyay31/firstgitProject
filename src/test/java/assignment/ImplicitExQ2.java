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

public class ImplicitExQ2 {
	
	static WebDriver driver;
	public static void click (int number) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File file1 = ss .getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\alkau\\Pictures\\Screenshots"+ number + ".png");
		
		FileUtils.copyFile(file1,  file2);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
	    driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        wait.until(ExpectedConditions.urlMatches("https://www.snapdeal.com/"));
        
        wait.until(ExpectedConditions.titleContains("Shop Online for Men"));
        
        JavascriptExecutor jss = (JavascriptExecutor)driver;
        
        click(1);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputValEnter")));
        
        jss.executeScript("document.getElementById('inputValEnter').click();");
        
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputValEnter")));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("inputValEnter")));
        
        jss.executeScript("document.getElementById('inputValEnter').value='water Bottle'");
        
        click(2);
        
        Thread.sleep(2000);
        
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("sd-icon sd-icon-search-under-catagory lfloat")));
        
       driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']/span//i")).click();
        
//        jss.executeScript("document.getElementsByClassName('searchTextSpan'.click();");

	
	}
}
