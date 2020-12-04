package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.internal.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseSetup {
    public  WebDriver driver;
    public Utils FileUtils;




    @Parameters({"browser"})
    public  void launchBrowserUrl(String browser) {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Chrome browser started");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("Firefox browser started");

        } else {
            System.out.println("Invalid Browser Name " + browser);
        }
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

}
