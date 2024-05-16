package assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropscreenshot {
static WebDriver driver;
	
	public static void capture(int number) throws IOException {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File file1 = tss.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\alkau\\Pictures\\Screenshots"+ number + ".png");
		
		FileUtils.copyFile(file1, file2);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
	    driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		WebElement ball= driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		capture(1);
		WebElement area = driver.findElement(By.id("dropzone2"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(ball, area ).build().perform();
		capture(2);
		WebElement ball1= driver.findElement(By.id("dropzone2"));
		 Thread.sleep(2000);
		 WebElement area1 = driver.findElement(By.id("droppable"));
		 
		 Actions act1 = new Actions(driver);
		 act.dragAndDrop(ball1, area1 ).build().perform();
		 capture(3);
		 Thread.sleep(3000);
		 driver.close();
		 
		 

	}

}
