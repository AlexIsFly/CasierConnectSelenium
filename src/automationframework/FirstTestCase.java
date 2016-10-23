package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

/**
 * Created by alexisgacel on 13/10/2016.
 */
public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "SeleniumWebDrivers/chromedriver");

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://jdp.juniorphelma.fr");


        System.out.println("Title = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //navigate() used to go back, forward, load, reload...
        driver.navigate().refresh();

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website jdp.juniorphelma.fr");

        WebElement element;
        element = driver.findElement(By.linkText("Connectez vous"));
        element.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //Wait for 5 Sec, but not recommended see SmartWaits.
        Thread.sleep(5);

        // Close the driver
        driver.quit();
    }
}
