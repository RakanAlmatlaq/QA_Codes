package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTheScrollbar{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div/div/button[1]")).click(); // To click on agree 
		Thread.sleep(2000); // Timer for 2 second

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000); // Timer for 2 second

		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);	

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
