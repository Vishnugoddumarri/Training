package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(SampleListener.class)
public class TestClass extends BaseSetup{
    @BeforeMethod
    public void setUp(){
       initialization();
    }
    @AfterMethod
    public void tearDown(){
   driver.quit();
    }
    @Test(priority =1)
    public void takeScreenshotTest(){
        By search=By.xpath("//input[@id='search']");
        WebElement searchElement= this.driver.findElement(search);
        searchElement.sendKeys("Biscuits");
        searchElement.sendKeys( Keys.ENTER);
        Assert.assertEquals(false, true);
    }
    @Test(priority = 2)
    public void clickProduct(){
        By product=By.xpath("//img[@class='product-image-photo' and @alt='Parle Krack Jack Crackers 400 g']");
        WebElement productElement= driver.findElement(product);
        productElement.click();

        By addCart=By.xpath("//span[@class='txt_btn' and text()='Add to Cart']");
        WebElement addCartElement= driver.findElement(addCart);
        addCartElement.click();
        Assert.assertEquals(false, true);

    }

}
