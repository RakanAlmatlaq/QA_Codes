package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		// To get attribute value from in side text box
		WebElement z= driver.findElement(By.name("Name"));
		z.getAttribute("placeholder");
		System.out.println(z.getAttribute("placeholder"));	

		Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
		}
}
