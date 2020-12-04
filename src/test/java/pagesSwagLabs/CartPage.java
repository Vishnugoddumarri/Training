package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseSetup;


import java.util.List;

public class CartPage extends BaseSetup {

    public CartPage(WebDriver driver) {
        this.driver=driver;
    }
    @FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']")
    WebElement  cartElement;
    @FindBy(xpath = "//button[text()='REMOVE']")
    WebElement removeElement;
    @FindBy(xpath ="//a[text()='Continue Shopping']")
    WebElement continueShoppingElement;

    public void clickOnCartButton() {
        cartElement.click();
    }
    public void productDetails(){
        List<WebElement> cartItemsList;
        cartItemsList = driver.findElements(By.cssSelector("div.cart_item"));
        int index = 1;
        double totalPrice = 0.0;
        for(WebElement Details:cartItemsList) {
            WebElement quantityElement = Details.findElement(By.className("cart_quantity"));
            WebElement descriptionElement = Details.findElement(By.className("inventory_item_name"));
            WebElement itemPriceElement = Details.findElement(By.className("inventory_item_price"));
            String itemPrice = itemPriceElement.getText();
            totalPrice = totalPrice + Double.parseDouble(itemPrice);
            System.out.println("PRODUCT--" + index);
            System.out.println("Quantity::"+quantityElement.getText());
            System.out.println("Description::" +descriptionElement.getText());
            System.out.println("Price:"+itemPrice);
            System.out.println("Total:"+totalPrice);

        }
    }
    public void clickOnButtonRemove() {
        removeElement.click();
    }
    public void clickOnContinueShoppingButton(){

        continueShoppingElement.click();
    }
}

