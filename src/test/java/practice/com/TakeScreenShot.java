package practice.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public static void main(String args[]) throws IOException {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver94.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        /** In the above code, we convert the WebDriver object (driver) to TakeScreenshot.
        And call getScreenshotAs() method to create an image file by providing the parameter *OutputType.FILE.
         */

        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        /** use this File object to copy the
        image at our desired location, as shown below, using the FileUtils Class.
         */
        try {
            FileUtils.copyFile(screenShot, new File("src/main/java/practice/com/ScreenShot.png"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        driver.close();
    }
}