package flipkart;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseSetup {
    public WebDriver driver;
    @Parameters({"browser"})
   @BeforeMethod
    public void launchBrowserUrl (String browser)
    {
        if(browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Chrome browser started");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }
        else if(browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver","geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("Firefox browser started");

        }

        else{
            System.out.println("Invalid Browser Name "+browser);
        }
        driver.manage().window().maximize();
       driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        String actualUrl="https://www.flipkart.com/";
        String expectedUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println("Flipkart HomePage verified");

    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }

}
