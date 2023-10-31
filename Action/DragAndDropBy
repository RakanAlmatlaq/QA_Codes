package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("https://jqueryui.com/draggable/"); // What website we look for

	      WebElement frame = driver. findElement(By.xpath("//*[@id=\"content\"]/iframe"));//frame that contains object
	      driver.switchTo().frame(frame);

	      WebElement draggable = driver.findElement(By.id("draggable"));//drag element

	      Actions action = new Actions(driver) ;
	      Thread.sleep(2000); //Timer for 2 second
	      new Actions(driver).dragAndDropBy(draggable, 200,30).build().perform();// to perform drag 
	      new Actions(driver).dragAndDropBy(draggable, 250,10).build().perform();
	      new Actions(driver).dragAndDropBy(draggable, 300,50).build().perform();

	      Thread.sleep(5000); //Timer for 5 second
	      driver.quit(); // Close the browser
	      }
	}
