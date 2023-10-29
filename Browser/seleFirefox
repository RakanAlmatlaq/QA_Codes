package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class seleFirefox {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new FirefoxDriver(); // object to run the browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // here we put the website for testing

		Thread.sleep(3000); // Timer for 3 second
		driver.close(); // Close the browser 
	}
}
