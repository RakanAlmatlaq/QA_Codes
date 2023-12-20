package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesUsingButtonClick{
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe
	
		WebDriver driver = new ChromeDriver(); // To open through Chrome browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/div/button[1]")).click(); 
		
		WebElement z = driver.findElement(By.id("agree-terms")); // Define web element by id 
		boolean a =z.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+a); // print the result
		
		WebElement check = driver.findElement(By.id("agree-terms")); // Define web element by id 
		check.click(); // To click in check box
		
		boolean b = check.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+b); // print the result

		Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
		}
}
