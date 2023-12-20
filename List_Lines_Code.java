package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; // import for chrome browser 
import org.openqa.selenium.edge.EdgeDriver; // import for edge browser 
import org.openqa.selenium.firefox.FirefoxDriver; // import for firefox browser 

public class WebElementsLogin {
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rakan\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); // here we put the path and the file name with .exe
	
		WebDriver driver = new ChromeDriver(); // To open through Chrome browser 
		WebDriver driver = new EdgeDriver(); // To open through Edge browser 
		WebDriver driver = new FirefoxDriver(); // To open through Firefox browser
		driver.manage().window().maximize(); // To max the browser 
		driver.get("https://google.com/"); // What website we look for
		----------------------------------------------------------------------------------------------------------------------------------------
		driver.findElement(By.className("fa-user-o")); // Define the element and find it by class
		driver.findElement(By.name("username")); // Define the element and find it by name
		driver.findElement(By.id("formGroupExampleInput")); // Define the element and find it by id
		driver.findElement(By.tagName("body")); // Define the element and find it by tagName
		driver.findElement(By.linkText("Prime")); // Define the element and find it by link text
		driver.findElement(By.partialLinkText("Inve")); // Define the element and find it by partial link text
		
		driver.findElement(By.xpath("//*[@id=\"_hj_feedback_container\"]/div/button/div"));  // Define the element and find it by xpath in Absolute
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button/div")); // Define the element and find it by xpath in Relative
		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-ag')]")); // Define the element and find it by xpath in starts-with
		driver.findElement(By.xpath("//button[@class='btn btn-agree']")); // Define the element and find it by xpath in class - button
		driver.findElement(By.xpath("//*[@id='agree' or @class='btn btn-agree']")); // Define the element and find it by xpath in or
		driver.findElement(By.xpath("//*[@id='formGroupExampleInput' and @class='form-control search_field']")); // Define the element and find it by xpath in and
		
		driver.findElement(By.cssSelector("button[class='btn btn-agree']")); // Define the element using cssSelector by class - button
		driver.findElement(By.cssSelector("input[id='formGroupExampleInput']")); // Define the element using cssSelector - ID 
		driver.findElement(By.cssSelector("input[placeholder='Password']")); // Define the element using cssSelector - placeholder
		driver.findElement(By.cssSelector("div[id*='']")); // Define the element using cssSelector Inner Text - id
		driver.findElement(By.cssSelector("i[class*='fa fa-user-o']:not([class*='fa fa-user-w'])")); // Define the element using cssSelector Not Contains - class 
		driver.findElement(By.cssSelector("div[id^='123']")); // Define the element using cssSelector Starts-with
		driver.findElement(By.cssSelector("div[id$='456']")); // Define the element using cssSelector Ends-with
		----------------------------------------------------------------------------------------------------------------------------------------
		WebElement s = driver.findElement(By.id("twotabsearchtextbox")); // Define the element and find it by id
		WebElement s = driver.findElement(By.className("btn")); // Define the element and find it by class
		----------------------------------------------------------------------------------------------------------------------------------------
		.sendKeys("  "); // To enter text inside filed
		.sendKeys(Keys.PAGE_DOWN); // To scroll page down
		.sendKeys(Keys.PAGE_UP); // To scroll page up
		.sendKeys("  ",Keys.ENTER); // To type and enter it
		.clear(); // To clear the text 
		.click(); // To click on botton
		----------------------------------------------------------------------------------------------------------------------------------------
		// To define object and scroll to the element has defined
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		WebElement a = driver.findElement(By.xpath("/html/body/div[2]/div/a[1]/img"));
		js.executeScript("arguments [0]. scrollIntoView();", a); 
		----------------------------------------------------------------------------------------------------------------------------------------
		// Define object for capital letters
		Actions shiftDown = new Actions(driver);
		Actions seriesOfAciActions = shiftDown ;
		seriesOfAciActions.moveToElement(shift)
		.keyDown(shift,Keys.SHIFT)
		.sendKeys(shift,"small letters to capital")
		.keyUp(shift,Keys.CONTROL) // To be highlight
		.build()
		.perform();
		----------------------------------------------------------------------------------------------------------------------------------------
		// Define object
		Actions shiftDown = new Actions(driver);
		Actions seriesOfAciActions = shiftDown ;
		WebElement shift = driver.findElement(By.cssSelector("input[id='formGroupExampleInput']"));
		// To type in capital
		seriesOfAciActions.moveToElement(shift)
		.keyDown(shift,Keys.SHIFT)
		.sendKeys(shift,"small letters to capital")
		//.keyUp(shift,Keys.CONTROL) // To be highlight
		.build().perform();
		----------------------------------------------------------------------------------------------------------------------------------------
		// Define the element and find it by name and enabled it
		WebElement a = driver.findElement(By.name("Email")); 
		System.out.println(a.isEnabled());
		----------------------------------------------------------------------------------------------------------------------------------------
		// To check if the checkbox is true or false and check it 
		WebElement z = driver.findElement(By.id("agree-terms")); // Define web element by id 
		boolean a =z.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+a); // print the result
		WebElement check = driver.findElement(By.id("agree-terms")); // Define web element by id 
		check.click(); // To click in check box
		boolean b = check.isSelected(); // Define true or false to check
		System.out.println("If it checked: "+b); // print the result
		----------------------------------------------------------------------------------------------------------------------------------------
		// To get text and print it as result
		WebElement email=driver.findElement(By.xpath("//*[contains(text(),'hello@google.com')]")); // To defined webelement & use contains
		System.out.println(email.getText()); // To print the email
		----------------------------------------------------------------------------------------------------------------------------------------
		// To copy text from the web and past it in search
		Actions doing = new Actions(driver); // To define object
		WebElement textToCopy = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/section/div/div/div/div/h1"));
		doing.moveToElement(textToCopy).doubleClick().build().perform(); // To double click
		WebElement textToPastElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/section/div/div/div/div/h1"));
		doing.moveToElement(textToPastElement).sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform(); // To copy (Ctrl + C)
		String any = textToCopy.getText();
		System.out.print(any);
		WebElement a = driver.findElement(By.cssSelector("input[id='formGroupExampleInput']"));
		driver.findElement(By.cssSelector("input[id='formGroupExampleInput']")).sendKeys(Keys.chord(any,Keys.CONTROL,"v")); // To past (Ctrl + V)
		----------------------------------------------------------------------------------------------------------------------------------------
		// To get attribute value from in side text box
		WebElement z= driver.findElement(By.name("Name"));
		z.getAttribute("placeholder");
		System.out.println(z.getAttribute("placeholder"));	
		----------------------------------------------------------------------------------------------------------------------------------------
		// To open a new tap
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.open('https://google.com/')");

		// To open a new window for incognito
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capa = new DesiredCapabilities();
		capa.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capa);
		WebDriver js = new ChromeDriver(options);
		js.get("https://google.com/"); 
		----------------------------------------------------------------------------------------------------------------------------------------
		// To check radio button if it empty or not and check on it using radio group 
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
		----------------------------------------------------------------------------------------------------------------------------------------
		// To scroll down where it finds word "Java"
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
		driver.findElement(By.linkText("Java")).click();
		----------------------------------------------------------------------------------------------------------------------------------------
		// To scroll page bottom using visibility
		JavascriptExecutor js = (JavascriptExecutor) driver; // To define object
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/section[5]/div/div"
		+ "/section/div/div/div/div[2]/div/a[1]/img")); // To scroll to the element
		js.executeScript("arguments [0]. scrollIntoView();", a); 
		----------------------------------------------------------------------------------------------------------------------------------------
		Thread.sleep(5000); // Timer for 5 second
		driver.quit(); // Close the browser
		}
}
