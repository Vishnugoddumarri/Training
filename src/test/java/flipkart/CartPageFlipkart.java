package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BaseSetup{


        public CartPage(WebDriver driver) {
            this.driver = driver;
        }
    @FindBy(xpath ="//span[text()='Cart']")
    WebElement  cartElement;
    @FindBy(xpath ="//div[text()='Remove']")
    WebElement removeElement;

        public void clickcart() {
            System.out.println("Number of items in Cart : " + driver.findElement(By.xpath("//div[@class='KK-o3G']")).getText());
            cartElement.click();

        }
        public void setCartItemsList(){
        List<WebElement> cartItemsList;
        cartItemsList =driver.findElements(By.xpath("//div[@class='KK-o3G']"));
        int index = 1;
        double totalPrice = 0.0;
            for(WebElement Details :cartItemsList)

        {
            WebElement quantityElement = Details.findElement(By.xpath("//div[@class='_3g_HeN']"));
            WebElement descriptionElement = Details.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']"));
            WebElement itemPriceElement = Details.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
            String itemPrice = itemPriceElement.getText();
            totalPrice = totalPrice + Double.parseDouble(itemPrice);
            System.out.println("PRODUCT--" + index);
            System.out.println("Quantity::" + quantityElement.getText());
            System.out.println("Description::" + descriptionElement.getText());
            System.out.println("Price:" + itemPrice);
            System.out.println("Total:" + totalPrice);
        }

    }

            public void verifyCartPage(){
            String actualUrl="https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click";
            String expectedUrl=driver.getCurrentUrl();
            Assert.assertEquals(actualUrl,expectedUrl);
            System.out.println("Flipkart CartPage verified");
        }

        public void clickRemove() {
            removeElement.click();


        }

    }
