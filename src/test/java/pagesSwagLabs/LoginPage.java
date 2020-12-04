package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement passWord;
    @FindBy(id = "login-button")
    WebElement loginButton;


    public void loginPage (String user,String password) {
        userName.sendKeys(user);
        userName.click();

        passWord.sendKeys(password);
        passWord.click();

        loginButton.click();
    }

}
