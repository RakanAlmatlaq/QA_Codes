package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingStartsWithTypeOfXpath {
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakan\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // here we put the path and the file name with .exe
	
		WebDriver driver = new ChromeDriver();  // To open through Chrome browser 
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-ag')]")).click(); // To click agree on cookie  
		Thread.sleep(2000); // Timer for 2 second

		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Keywo')]")).sendKeys("Game"); // To click & type 
		Thread.sleep(2000); // Timer for 2 second

		driver.findElement(By.xpath("//div[starts-with(@class,'control__indi')]")).click(); // To click on check box
		Thread.sleep(2000); // Timer for 2 second

		driver.findElement(By.xpath("//button[starts-with(@value,'clea')]")).click(); // To click on clear all button

		Thread.sleep(6000); // Timer for 6 second
		driver.quit(); // Close the browser
		}
}
