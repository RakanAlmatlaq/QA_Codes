package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("https://jqueryui.com/droppable/"); // What website we look for

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo()
		.frame(frame) ;

		WebElement drag = driver. findElement(By.id("draggable"));
		Thread.sleep(2000); // Timer for 2 second

		WebElement drop = driver. findElement(By.id("droppable"));
		Thread.sleep(2000); // Timer for 2 second

		Actions action = new Actions(driver) ;
		action.dragAndDrop(drag, drop).perform();

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
	}
}
