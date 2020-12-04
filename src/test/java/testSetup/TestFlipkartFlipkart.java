package testSetup;

import flipkart.BaseSetup;
import flipkart.CartPage;
import flipkart.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFlipkart extends BaseSetup {

    String category="Mobiles";
    String mobileName="POCO M2 Pro (Two Shades of Black, 64 GB)";
    String ram="4 GB";
    String cell="//div[text()='POCO']";
    //Enter price as Low to High (or)  High to Low
    String priceSort="High to Low";


    @Test
    public void testFlipkart() throws InterruptedException {

        //Actions in SearchPage
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);

        searchPage.testSearch(category);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        searchPage.filters(ram,cell);
        searchPage. sortBy(priceSort);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        searchPage.clickProduct(mobileName);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //Actions in CartPage
        CartPage cart= PageFactory.initElements(driver,CartPage .class);
        cart.clickcart();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        cart.verifyCartPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cart.setCartItemsList();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cart.clickRemove();


    }

}

