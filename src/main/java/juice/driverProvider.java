package juice;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DriverProvider implements Provider<DriverInterface> {

    @Inject
    private FirefoxWebDriver firefoxDriver;

    @Inject
    private ChromeWebDriver chromeWebDriver;

    @Inject
    public DriverProvider() {
        // super();
    }

    public DriverInterface get() {
        if (System.getProperty("browser").equals("Chrome"))
            return chromeWebDriver;
        else
            return firefoxDriver;
    }
}
