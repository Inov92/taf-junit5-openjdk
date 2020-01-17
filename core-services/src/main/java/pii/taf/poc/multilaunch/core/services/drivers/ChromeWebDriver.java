package pii.taf.poc.multilaunch.core.services.drivers;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@Getter
public class ChromeWebDriver {

    private WebDriver driver;

    public ChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
