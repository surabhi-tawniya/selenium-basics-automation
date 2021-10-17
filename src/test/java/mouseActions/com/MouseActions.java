package mouseActions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) {
		String baseurl=("http://www.facebook.com/");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver93.exe");
		WebDriver webDriver = new ChromeDriver();

                webDriver.get(baseurl);
                WebElement txtUsername = webDriver.findElement(By.id("email"));
                WebElement txtPassword = webDriver.findElement(By.id("pass"));

                Actions builder = new Actions(webDriver);
                Action seriesOfActions = builder
                	.moveToElement(txtUsername)
                	.click()
                	.keyDown(txtUsername, Keys.SHIFT)
                	.sendKeys(txtUsername, "hello")
                	.keyUp(txtUsername, Keys.SHIFT)
                	
                	.doubleClick(txtPassword)
                	.contextClick()
                
                	.dragAndDrop( txtUsername, txtPassword) // wrong syntax need to correct dragdrop action syntax
                    .build();
                	
                seriesOfActions.perform() ;

                }
	}


