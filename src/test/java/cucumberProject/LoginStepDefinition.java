package cucumberProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

    WebDriver driver;


    @Given("^user is already on Login Page$")
    public void user_already_on_login_page(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }


    @When("^title of login page is Swag Labs$")
    public void title_of_login_page_is_Swag_Labs(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Swag Labs", title);
    }


    @Then("^user enters Username and  Password$")
    public void user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        // WebElement loginBtn =
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }


    @And("^user is on home page$")
    public void user_is_on_hopme_page(){
        String title = driver.getTitle();
        System.out.println("Home Page title ::"+ title);
        Assert.assertEquals("Swag Labs", title);
    }


    @Then("^Close the browser$")
    public void close_the_browser(){
        driver.quit();
    }

}

