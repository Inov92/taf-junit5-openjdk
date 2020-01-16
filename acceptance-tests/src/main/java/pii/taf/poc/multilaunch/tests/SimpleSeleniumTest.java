package pii.taf.poc.multilaunch.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSeleniumTest {

    private static final String SITE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    private WebDriver driver;

    @BeforeEach
    void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
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
