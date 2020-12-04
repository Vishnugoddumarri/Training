package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseSetup;


public class HomePage extends BaseSetup {

    public HomePage(WebDriver driver) {
        this.driver= driver;

    }
    @FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
    WebElement productElement;
    @FindBy(xpath ="//button[text()='ADD TO CART']")
    WebElement singleCartButton;
    @FindBy(xpath ="//button[text()='<- Back']")
    WebElement  backElement;
    @FindBy(xpath ="//button[@class='btn_primary btn_inventory']")
    WebElement multipleAddCart;

    public void clickOnProduct(){
        productElement.click();
        singleCartButton.click();
        backElement.click();
    }
    public void clickMultipleProducts(){
        multipleAddCart.click();
    }
}
