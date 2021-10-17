package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class CheckBox {

	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			 
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			  
			  driver.findElement(By.id("check1")).click();
			  
			  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
			  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
			  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")).click();
			  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();
			  
               

			  
			
	}

}
