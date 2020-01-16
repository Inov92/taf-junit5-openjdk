package pii.taf.poc.multilaunch.core.services.drivers;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
public class ChromeWebDriver {

    private WebDriver driver;

    public ChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        this.driver = new ChromeDriver();
    }
}
