package onlyFullStack.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");  // sets the path of chromedriver.exe file
		WebDriver driver = new ChromeDriver();     // created object of webdriver 
		
		//driver.get("https://www.google.com/");   // we gave the url of google
	
		driver.navigate().to("https://www.google.com/"); // instead of using get method we can also use navigate to open current url provided
    	
		driver.findElement(By.id("gsr")).click(); // this will click the google images page by clicking on it 
		Thread.sleep(3000);
		
		driver.navigate().back();     // this method will move the page to its backword i.e google images to google
		Thread.sleep(1000);
        System.out.println("Back done....");
        
		driver.navigate().forward(); // move the current page to the next page 
		Thread.sleep(1000);
		System.out.println("Forword Done....");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("Refresh Done.....");
		
		driver.close();
 	}

}
