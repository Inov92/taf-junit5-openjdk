package pii.taf.poc.multilaunch.core.services.product.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPanel {

    private WebDriver driver;

    @FindBy(id = "user-icon")
    private WebElement userIcon;

    @FindBy(id = "name")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = ".btn-login")
    private WebElement loginButton;

    @FindBy(css = ".fa-sign-out")
    private WebElement logoutButton;

    @FindBy(id = "user-name")
    private WebElement profileName;

    @Getter
    @FindBy(css = ".login-txt")
    private WebElement errorMessage;

    public LoginPanel(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void login() {
        userIcon.click();
        loginField.sendKeys("Roman");
        passwordField.sendKeys("Jdi1234");
        loginButton.click();
    }

    public void login(String userName, String password) {
        userIcon.click();
        loginField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public String getProfileName() {
        return profileName.getText();
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

}
