package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;



/* **For checking the broken links, you will need to do the following steps.

        1. Collect all the links in the web page based on "a" and "img" tags.(anchor tag)
        2. Send HTTP request for the link and read HTTP response code.
        3. Find out whether the link is valid or broken based on HTTP response code.
        4. Repeat this for all the links captured. */

public class BrokenLinks {

    public static void main(String args[]) throws InterruptedException, IOException {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "E:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        Thread.sleep(3000);

         // capture all links available on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //print the total no. of links available
        System.out.println("Total number of links : " + links.size());

        // now iterate the links
        for(int i = 0; i<links.size();i++) {

            WebElement element = links.get(i);

            System.out.println(element);

            String url = element.getAttribute("href");

            URL link =  new URL(url);

            // create connection using url object 'link'

            HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();

            Thread.sleep(3000);

            httpconn.connect();

            int respcode = httpconn.getResponseCode();

            if (respcode >= 400)
            {
                System.out.println(url + "-" + " is broken link");
            }
            else
            {
                System.out.println(url + "-" + " is active link");
            }

            httpconn.disconnect();
        }
    }


}
