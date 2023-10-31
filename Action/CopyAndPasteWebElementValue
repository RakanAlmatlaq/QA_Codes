package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPasteWebElementValue{
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe
	
		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		Actions doing = new Actions(driver); // To define object
		WebElement textToCopy = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/section/div/div/div/div/h1"));
		doing.moveToElement(textToCopy).doubleClick().build().perform(); // To double click

		WebElement textToPastElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/section/div/div/div/div/h1"));
		doing.moveToElement(textToPastElement).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform(); // To copy (Ctrl + C)

		String any = textToCopy.getText();
		System.out.print(any);
		WebElement a = driver.findElement(By.cssSelector("input[id='formGroupExampleInput']"));
		 driver.findElement(By.cssSelector("input[id='formGroupExampleInput']")).sendKeys(Keys.chord(any,Keys.CONTROL,"v")); // To past (Ctrl + V)

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser*/
		}
}
