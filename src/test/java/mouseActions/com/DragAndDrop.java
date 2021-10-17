package mouseActions.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		Actions builder = new Actions(driver);
		
		WebElement from =  driver.findElement(By.id("draggable"));
        
		 WebElement to =  driver.findElement(By.id("droppable"));
		
		//syntax= dragAndDrop(WebElementsource, WebElement target)
		
		 builder.dragAndDrop(from , to).perform();
		 
		//verify text changed in to 'Drop here' box 
		 String textTo = to.getText();
		 
		 if(textTo.equals("Dropped!")) {
		 System.out.println("PASS: Source is dropped to target as expected");
		 }else {
		 System.out.println("FAIL: Source couldn't be dropped to target as expected");
		 }
		 
		 driver.close();
		 
	}

}
