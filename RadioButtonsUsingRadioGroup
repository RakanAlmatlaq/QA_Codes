package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsUsingRadioGroup{
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		Thread.sleep(2000); // Timer for 2 second
		WebElement z = driver.findElement(By.id("html")); // Define web element by id 		
		boolean a =z.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+a); // print the result
		z.click();
		Thread.sleep(2000); // Timer for 2 second

		boolean b =z.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+b); // print the result

		WebElement x = driver.findElement(By.id("css")); // Define web element by id 
		x.click();
		boolean c =z.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+c); // print the result

		Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
		}
}
