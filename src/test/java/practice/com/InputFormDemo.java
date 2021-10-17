package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class InputFormDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		 
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.name("first_name")).sendKeys("Surabhi");
		  
		  driver.findElement(By.name("last_name")).sendKeys("Tawniya");
		  
		  driver.findElement(By.name("email")).sendKeys("suhdbjs@gmail.com");
		  
		  driver.findElement(By.name("phone")).sendKeys("685154546595");
		  
		  driver.findElement(By.name("address")).sendKeys("priyadarshini nagar ");
		  
		  driver.findElement(By.name("city")).sendKeys("raipur");
		  
		  WebElement selectDropDown = driver.findElement(By.name("state"));
			Select  dropDown = new Select(selectDropDown);
			dropDown.selectByVisibleText("Indiana");
			
		 driver.findElement(By.name("zip")).sendKeys("256387");
		   
		  driver.findElement(By.name("website")).sendKeys("www.abcd.com");
		  
		  driver.findElement(By.name("hosting")).click();
		  
		  driver.findElement(By.name("comment")).sendKeys("shakgkdajdh cvsjgygdus guagduausgg");
		  
		  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
		
		

	}

}
