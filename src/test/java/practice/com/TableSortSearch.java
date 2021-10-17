package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class TableSortSearch {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
			 
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			  
			  WebElement selectDropDown = driver.findElement(By.name("example_length"));
				Select  dropDown = new Select(selectDropDown);
				dropDown.selectByValue("50");
				
			  
			 driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Wagner");
			  

	}

}
