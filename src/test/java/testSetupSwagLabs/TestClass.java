package testSetup;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseSetup;

public class TestClass extends BaseSetup {
        //LoginPage inputs
        String user = "standard_user";
        String password=  "secret_sauce";
        //HomePage inputs
        int count=3;
        //CheckOutPage inputs
        String name="Person";
        String lastname="person";
        String zipCode="515001";


        @Test
        public void testSwagLabs(){
            //LoginPage actions
            LoginPage login =PageFactory.initElements(driver,LoginPage.class);
            login.loginPage(user, password);

            //Test Title
            Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

            //HomePage actions
            HomePage home=PageFactory.initElements(driver,HomePage.class);
            if(count>0 && count<6){
                for(int i=1;i<=count;i++)
                {
                    home.clickMultipleProducts();
                }
            }
            else {
                home.clickOnProduct();
            }

            //CartPage actions
            CartPage cart=PageFactory.initElements(driver,CartPage.class);
            cart.clickOnCartButton();

            //Verify CartPage Title
            Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
            cart.productDetails();

            //CheckOutPage actions
            CheckOutPage checkOut=PageFactory.initElements(driver,CheckOutPage.class);
            checkOut.clickCheckOut();
            checkOut.firstName(name);
            checkOut.lastName(lastname);
            checkOut.postalCode(zipCode);
            checkOut.clickCancel();
              ProductNavigation checkNavigate=PageFactory.initElements(driver,ProductNavigation.class);

            //Remove added products
            if(count>0 && count<6) {
                for (int i = 1; i <= count; i++) {
                    checkNavigate.navigateProductPage();
                    cart.clickOnCartButton();
                    cart.clickOnButtonRemove();
                }
            }
            else {
                cart.clickOnButtonRemove();
            }

            cart.clickOnContinueShoppingButton();

            //LogoutPage actions
            LogOutPage log=PageFactory.initElements(driver,LogOutPage.class);
            log.ClickOnLogOutButton();


        }

        @BeforeMethod
        public void initialization(){
            launchBrowserUrl("Chrome");

        }
        @AfterMethod
        public void teardown(){
            driver.close();
        }

    }



