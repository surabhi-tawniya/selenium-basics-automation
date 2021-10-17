package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class PracticeForm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("ved");
        driver.findElement(By.name("lastname")).sendKeys("tawniya");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.id("datepicker")).sendKeys("30-04-2019");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();

        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"continents\"]")));
        dropdown.selectByVisibleText("Africa");

        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[4]")).click();

        WebElement upload_file = driver.findElement(By.id("photo"));
        upload_file.sendKeys("E:\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\practice\\com\\ScreenShot.png");
        System.out.println("File is uploaded successfully");

        driver.findElement(By.linkText("Click here to Download File")).click();
        System.out.println("File is downloaded successfully");

        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}
