package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver();  // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button/div")).click(); // Define the element and find it by xpath in Relative

		Thread.sleep(6000); // Timer for 6 second
		driver.quit(); // Close the browser
		}
}
