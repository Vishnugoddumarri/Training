package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.BaseSetup;

public class ProductNavigation extends BaseSetup {
    public ProductNavigation(WebDriver driver) {
        this.driver=driver;
    }
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement navigate;

    public void navigateProductPage(){
        navigate.click();
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

    }
}
