package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingOrandAndTpeOfXpath {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new ChromeDriver();  // To open through Chrome browser 
		driver.manage().window().maximize(); // To max the browser 
		driver.get("www.google.com"); // What website we look for

		driver.findElement(By.xpath("//*[@id='agree' or @class='btn btn-agree']")).click(); // To click on agree for cookies
		Thread.sleep(2000); // Time for 2 second
		driver.findElement(By.xpath("//*[@id='formGroupExampleInput' and @class='form-control search_field']"))
		.sendKeys("sky"); // To click & type "sky"
		Thread.sleep(2000); // Time for 2 second
		driver.findElement(By.xpath("//*[@id='formGroupExampleInputx' or @class='search_btn']")).click(); // To click on search button
		Thread.sleep(2000); // Time for 2 second
		driver.findElement(By.xpath("//*[@id='mySelect' and @class='form-control']")).click(); // To click drop down

		Thread.sleep(6000); // Timer for 6 second
		driver.quit(); // Close the browser
		}
}
