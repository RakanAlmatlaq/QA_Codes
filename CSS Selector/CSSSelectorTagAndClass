package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTagAndClass{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("button[class='btn btn-agree']")).click(); // Define the element using CSSSelector by class and click on it
		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("i[class='fa fa-youtube']")).click(); // Define the element using CSSSelector by class and click on it

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
