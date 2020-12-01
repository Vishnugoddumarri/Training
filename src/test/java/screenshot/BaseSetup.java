package screenshot;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

import java.io.File;
import java.io.IOException;

public class BaseSetup {
    public static WebDriver driver;
    public Utils FileUtils;
    public static void initialization(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.jiomart.com/");
    }
    public void failed(String methodName){
       File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\Users\\vishnu\\IdeaProjects\\Listerners_TestNG\\screenshots\\"+methodName+"_"+".jpg"));
        System.out.println("Screenshot taken");
    }

}
