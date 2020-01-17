package pii.taf.poc.multilaunch.core.services.product.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPanel {

    @FindBy(id = "user-icon")
    public WebElement userIcon;

    @FindBy(id = "name")
    public WebElement loginField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = ".btn-login")
    public WebElement loginButton;

    @FindBy(css = ".fa-sign-out")
    public WebElement logoutButton;

    @FindBy(id = "user-name")
    public WebElement profileName;

    public LoginPanel(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
