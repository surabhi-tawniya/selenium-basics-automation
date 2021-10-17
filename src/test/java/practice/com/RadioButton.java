package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class RadioButton {

	public static void main(String[] args)   throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		 
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		
		  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")).click();
		  
		  driver.findElement(By.id("buttoncheck")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
		  
		  driver.findElement(By.name("ageGroup")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		  
	}

}
