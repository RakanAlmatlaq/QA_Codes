package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorUsingStartswithAndEndswithAndContains{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.cssSelector("input[class*='form-control']:not([clas"
		+ "s*='form-control search_text'])")).sendKeys("fun"); // Define the element using cssSelector Not Contains
		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("button[class^='sear']")).click(); // Define the element using cssSelector Starts-with
		Thread.sleep(2000); // Timer for 2 second
		driver.findElement(By.cssSelector("button[class$='agree']")).click(); // Define the element using cssSelector Ends-with

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
	}
