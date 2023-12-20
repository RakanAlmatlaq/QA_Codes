package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver();  // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.xpath("//*[@id=\"_hj_feedback_container\"]/div/button/div")).click(); // To click and type

		Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
		}
}
