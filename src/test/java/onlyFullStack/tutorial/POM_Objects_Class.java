package onlyFullStack.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Objects_Class {
	
	WebDriver driver;
	
	By txt_name = By.id("name-text-field-id");
	
	By email_txt_feild = By.id("email-text-field-class");
	
	By zip_code = By.id("Zip");
	
	By mobile_number = By.id("mobileNumber");
	
	public POM_Objects_Class(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void entername(String name) {
		
		driver.findElement(txt_name).sendKeys(name);
		
		}
	public void email(String email) {
		
		driver.findElement(email_txt_feild).sendKeys(email);
	}
	
	public void zipCode(String zip) {
		
		driver.findElement(zip_code).sendKeys(zip);
		
	}
	
	public void mobNo(String mobNO) {
		
		driver.findElement(mobile_number).sendKeys(mobNO);
	}
}
