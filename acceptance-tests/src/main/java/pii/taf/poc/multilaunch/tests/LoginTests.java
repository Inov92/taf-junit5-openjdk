package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pii.taf.poc.multilaunch.core.services.drivers.ChromeWebDriver;
import pii.taf.poc.multilaunch.core.services.product.pages.LoginPanel;

class LoginTests {

    private static final String SITE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    private WebDriver driver;

    @BeforeEach
    void init() {
        driver = new ChromeWebDriver().getDriver();
    }

    @Test
    void loginTest() {
        driver.get(SITE_URL);
        LoginPanel loginPanel = new LoginPanel(driver);
        loginPanel.userIcon.click();
        loginPanel.loginField.sendKeys("Roman");
        loginPanel.passwordField.sendKeys("Jdi1234");
        loginPanel.loginButton.click();
        Assertions.assertEquals("ROMAN IOVLEV", loginPanel.profileName.getText());
    }

    @AfterEach
    void quit() {
        driver.quit();
    }
}
