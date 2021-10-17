package onlyFullStack.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ObjectRepository {


		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
			WebDriver webDriver = new ChromeDriver();
			
			webDriver.get("https://onlyfullstack.blogspot.com/2020/03/best-demo-website-to-practice-selenium.html");
			
			   webDriver.manage().window().maximize();
				  Thread.sleep(5000);
				// Load the properties File		
		 Properties obj = new Properties();					
	    FileInputStream objfile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\mvnworkspace\\DemoMavenEclipseProject\\src\\main\\java\\com\\tutorial\\application.properties");
	    obj.load(objfile);	
	    
	    webDriver.findElement(By.xpath(obj.getProperty("name-feild"))).sendKeys("surabhi");
	    
	    webDriver.findElement(By.xpath(obj.getProperty("email-feild"))).sendKeys("sdjkhdh@gmail.com");
	    
	    webDriver.findElement(By.xpath(obj.getProperty("zip-code"))).sendKeys("468458");
	    
				
	}

}
