package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pii.taf.poc.multilaunch.core.services.drivers.ChromeWebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("smoke")
class SimpleSeleniumTests {

    private static final String SITE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    private WebDriver driver;

    @BeforeEach
    void init() {
        driver = new ChromeWebDriver().getDriver();
    }

    @Test
    void simpleSeleniumTest() {
        driver.get(SITE_URL);
        assertEquals(SITE_URL, driver.getCurrentUrl());
    }

    @AfterEach
    void quit() {
        driver.quit();
    }

}
