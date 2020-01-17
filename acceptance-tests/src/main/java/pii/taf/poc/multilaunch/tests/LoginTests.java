package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.WebDriver;
import pii.taf.poc.multilaunch.core.services.drivers.ChromeWebDriver;
import pii.taf.poc.multilaunch.core.services.product.pages.LoginPanel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginTests {

    private static final String SITE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    private WebDriver driver;
    private LoginPanel loginPanel;

    @BeforeEach
    void init() {
        driver = new ChromeWebDriver().getDriver();
        driver.get(SITE_URL);
        loginPanel = new LoginPanel(driver);
    }

    @RepeatedTest(3)
    void loginTest() {
        loginPanel.login();
        assertEquals("ROMAN IOVLEV", loginPanel.getProfileName());
    }

    @RepeatedTest(3)
    void logoutTest() {
        loginPanel.login();
        loginPanel.logout();
        assertTrue(loginPanel.getProfileName().isBlank());
    }

    @RepeatedTest(3)
    void incorrectLoginMessageTest() {
        loginPanel.login("Parallel", "POC");
        assertEquals("* Login Faild", loginPanel.getErrorMessageText());
    }

    @RepeatedTest(3)
    void incorrectLoginTest() {
        loginPanel.login("Parallel", "POC");
        assertTrue(loginPanel.getErrorMessage().isDisplayed());
    }

    @AfterEach
    void quit() {
        driver.quit();
    }
}
