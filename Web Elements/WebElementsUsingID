package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsUsingID {
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver();  // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		WebElement s = driver.findElement(By.id("twotabsearchtextbox")); // Define the element and find it by id
		s.sendKeys("Laptop"); // To type for search
		s.submit(); // To submit
		}
}
