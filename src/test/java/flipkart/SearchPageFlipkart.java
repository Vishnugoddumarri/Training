package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


    public class SearchPage extends BaseSetup {


      public SearchPage(WebDriver driver) {
            this.driver=driver;
       }
        @FindBy(xpath = "//input[@type='text' and @autocomplete='off']")
        WebElement searchElement;
        @FindBy(xpath ="//div[text()='POCO']")
        WebElement brandElement;
        @FindBy(xpath ="//div[@class='_4rR01T']")
        WebElement  productElement;
        @FindBy(xpath ="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
        WebElement addCartElement;
        @FindBy(xpath = "//a[text()='Mobiles']")
        WebElement backMobilesSectionElement;



        public void testSearch(String category){
            searchElement.sendKeys(category);
            searchElement.sendKeys( Keys.ENTER);

        }
        public void filters(String ram,String cell)
        {
            By capacity=By.xpath("//div[text()='"+ram+"']");
            WebElement capacityElement= driver.findElement(capacity);
            capacityElement.click();

            brandElement.click();
            String resultProducts=driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
            System.out.println("Filtered products : "+resultProducts);
        }
        public void sortBy(String priceSort){
            By product=By.xpath("//div[text()='Price -- "+priceSort+"']");
            WebElement productElement= driver.findElement(product);
            productElement.click();

        }
        public void clickProduct(String mobileName)  {

            productElement.click();


            addCartElement.click();

            By backMobile=By.xpath("//a[text()='"+mobileName+"']");
            WebElement backMobileElement= driver.findElement(backMobile);
            backMobileElement.click();


            backMobilesSectionElement.click();

        }
        public void clickMultipleProducts(){
            productElement.click();

            addCartElement.click();

        }
      public void verifySearchPage(){
            String expectedTitle="Mobiles - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
            String actualTitle=driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle);
            System.out.println("Flipkart SearchPage verified");
        }

    }
