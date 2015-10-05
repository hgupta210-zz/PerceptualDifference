package juice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FirefoxWebDriver implements DriverInterface {

    private WebDriver wd1;
    private WebDriver wd2;

    @Inject
    public FirefoxWebDriver() {
        // wd1 = new FirefoxDriver();
        // wd2 = new FirefoxDriver();
    }

    public WebDriver getDriver1() {
        if (wd1 == null)
            wd1 = new FirefoxDriver();
        return wd1;
    }

    public WebDriver getDriver2() {
        if (wd2 == null)
            wd2 = new FirefoxDriver();
        return wd2;
    }
}
