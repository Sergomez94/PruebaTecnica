import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;

public class prueba {   

@Test   

public void testGoogleSearch() throws InterruptedException {     

  // Optional. If not specified, WebDriver searches the PATH for chromedriver.                  WebDriver driver = new ChromeDriver(); 

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	System.setProperty("webdriver.chrome.driver", "src/test/resources/webDriver/windows/chromedriver.exe");
	driver.get("http://www.google.com/");    

  Thread.sleep(5000);  // Let the user actually see something!     

  WebElement searchBox = driver.findElement(By.name("q"));

  searchBox.sendKeys("ChromeDriver");     

  searchBox.submit();    

  Thread.sleep(5000);  // Let the user actually see something!     

  driver.quit();  

 } 

}