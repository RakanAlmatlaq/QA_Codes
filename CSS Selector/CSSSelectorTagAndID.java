package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTagAndID{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.cssSelector("input[id='formGroupExampleInput']")).sendKeys("Indoor"); // Define the element using cssSelector by ID and type
		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("button[class='search_btn']")).click(); // Define the element using cssSelector by class and click

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
