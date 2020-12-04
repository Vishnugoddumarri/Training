package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseSetup;


public class LogOutPage extends BaseSetup {
    public LogOutPage(WebDriver driver) {
        this.driver=driver;
    }
    @FindBy(xpath ="//button[text()='Open Menu']")
    WebElement  menuElement;
    @FindBy(id= "logout_sidebar_link")
    WebElement  logoutElement;

    public void ClickOnLogOutButton() {
        menuElement.click();
        logoutElement.click();
    }
}
