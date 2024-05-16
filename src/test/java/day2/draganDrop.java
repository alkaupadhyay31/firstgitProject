package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		 WebElement ball= driver.findElement(By.id("draggable"));
		 Thread.sleep(2000);
		 WebElement area = driver.findElement(By.id("dropzone2"));
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.dragAndDrop(ball, area ).build().perform();
		  Thread.sleep(4000);
		 WebElement ball1= driver.findElement(By.id("dropzone2"));
		 Thread.sleep(2000);
		 WebElement area1 = driver.findElement(By.id("droppable"));
		 
		 Actions act1 = new Actions(driver);
		 act.dragAndDrop(ball1, area1 ).build().perform();
		 Thread.sleep(3000);
		 driver.close();
		 
		 

			
		 
		 
	}

}
