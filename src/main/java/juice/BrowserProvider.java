package juice;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class BrowserProvider implements Provider<DriverType> {

    @Inject
    private FirefoxWebDriver firefoxDriver;

    @Inject
    private ChromeWebDriver chromeWebDriver;

    @Inject
    public BrowserProvider() {
        
    }

    public DriverType get() {
        if (System.getProperty("browser").equals("Chrome"))
            return chromeWebDriver;
        else
            return firefoxDriver;
    }
}
