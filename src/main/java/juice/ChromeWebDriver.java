package juice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ChromeWebDriver implements driverInterface {
    private WebDriver wd1;
    private WebDriver wd2;

    @Inject
    public ChromeWebDriver() {

    }

    public WebDriver getDriver1() {
        if (wd1 == null) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
            wd1 = new ChromeDriver();
        }
        return wd1;
    }

    public WebDriver getDriver2() {
        if (wd2 == null) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
            wd2 = new ChromeDriver();
        }
        return wd2;
    }
}
