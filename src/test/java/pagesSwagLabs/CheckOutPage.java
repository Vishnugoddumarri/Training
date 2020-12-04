package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseSetup;

public class CheckOutPage extends BaseSetup {
    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    WebElement checkOutElement;
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstnameElement;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement last_nameElement;
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postal_CodeElement;
    @FindBy(xpath = "//a[@class='cart_cancel_link btn_secondary']")
    WebElement cancelElement;

    public void clickCheckOut(){
        checkOutElement.click();
    }
    public void firstName(String name){
        firstnameElement.click();
        firstnameElement.sendKeys(name);

    }
    public void lastName(String lastname){
        last_nameElement.click();
        last_nameElement.sendKeys(lastname);

    }
    public void postalCode(String zipCode){
        postal_CodeElement.click();
        postal_CodeElement.sendKeys(zipCode);

    }
    public void clickCancel(){
        cancelElement.click();

    }

}
