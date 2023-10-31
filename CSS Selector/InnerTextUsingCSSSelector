package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerTextUsingCSSSelector{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.cssSelector("select[id*='mySelect']")).click(); // Define the element using cssSelector Inner Text
		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("option[id*='Jeddah']")).click(); // Define the element using cssSelector Inner Text

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
