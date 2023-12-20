package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;

public class NewWindowInSelenium{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		// To open a new tap
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.open('www.google.com')");

		// To open a new window for incognito
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capa);
		WebDriver js = new ChromeDriver(options);
		js.get("www.google.com");

		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
	}
}
