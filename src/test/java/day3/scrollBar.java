package day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBar {
	static WebDriver driver;
	
	public static void capture(int number) throws IOException {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File file1 = tss.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\alkau\\Pictures\\Screenshots"+ number + ".png");
		
		FileUtils.copyFile(file1, file2);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
	    driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('checkBoxOption1').click();");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('autocomplete').value='Hii'");
		capture(1);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		capture(2);
		js.executeScript("window.scrollBy(0,-900)");

		Thread.sleep(2000);
		WebElement courseButton = driver.findElement(By.linkText("REST API"));
		js.executeScript("arguments[0].scrollIntoView();", courseButton);
		
		Thread.sleep(2000);
		capture(3);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")));
		capture(4);
		
		
		
		
	}

}
