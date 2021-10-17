package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DuobleInputFeild {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		
        
		 driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		 
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		   driver.findElement(By.id("sum1")).sendKeys("8");
		   
		   driver.findElement(By.id("sum2")).sendKeys("4");
		   
		   driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
		  
	}

}
