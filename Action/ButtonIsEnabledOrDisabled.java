package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonIsEnabledOrDisabled {
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe
	
		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("file:///C:/Users/Rakan/Desktop/index.html"); // What website we look for
		
		// Define the element and find it by name and enabled it
		WebElement a = driver.findElement(By.name("Email")); 
		System.out.println(a.isEnabled());	
		
		Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
		}
}
