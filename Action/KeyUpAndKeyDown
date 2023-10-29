package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		// Define object
		Actions shiftDown = new Actions(driver);
		Actions seriesOfAciActions = shiftDown ;

		WebElement shift = driver.findElement(By.cssSelector("input[id='formGroupExampleInput']"));

		// To type in capital
		seriesOfAciActions.moveToElement(shift)
		.keyDown(shift,Keys.SHIFT)
		.sendKeys(shift,"small letters to capital")
		.keyUp(shift,Keys.CONTROL) // To be highlight
		.build().perform();

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
