package selenium;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleEdge {
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakan\\Downloads\\chromedriver_win32\\chromedriver.exe"); // here we put the path and the file name with .exe

		WebDriver driver = new EdgeDriver(); // To open through Edge browser 
    driver.manage().window().maximize(); // To max the browser 
		driver.get("https://www.google.com"); // here we put the website for testing

    Thread.sleep(10000); // Timer for 10 second
		driver.quit(); // Close the browser
	}
}
