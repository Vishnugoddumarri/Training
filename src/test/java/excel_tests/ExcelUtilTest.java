package excel_tests;
import com.excel.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ExcelUtilTest {


    public static void main(String[] args) {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/excel/TestData.xlsx");
        String sheetName = "Sheet1";
        //System.out.println(reader.getCellData(sheetName, "Username", 2));
        String data = reader.getCellData(sheetName, "Username", 2);
        System.out.println(data);
        String passwordData = reader.getCellData(sheetName, "Password", 2);
        System.out.println(passwordData);

        // int rowCount = reader.getRowCount(sheetName);
        //System.out.println("total rows: "+ rowCount);

        if (!reader.isSheetExist("HomePage")) {
            reader.addSheet("HomePage");
        }

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement userName = driver.findElement(By.id( "user-name"));
        WebElement pwd = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        //WebElement  menuElement=driver.findElement(By.className("bm-burger-button"));
        //WebElement logoutElement=driver.findElement(By.id("logout_sidebar_link"));


        int rowCount = reader.getRowCount(sheetName);

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            String loginId = reader.getCellData(sheetName, "Username", rowNum);
            String passsword = reader.getCellData(sheetName, "Password", rowNum);

            System.out.println(loginId + " " + passsword);


            userName.clear();
            userName.sendKeys(loginId);

            pwd.clear();
            pwd.sendKeys(passsword);

            loginbutton.click();

           // menuElement.click();

           //logoutElement.click();
        }

        }


    }

