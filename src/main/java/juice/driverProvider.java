package juice;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class driverProvider implements Provider<driverInterface> {

    @Inject
    private FirefoxWebDriver firefoxdriver;

    @Inject
    private ChromeWebDriver chromeWebDriver;

    @Inject
    public driverProvider() {
        super();
    }

    public driverInterface get() {

        System.out.println(System.getProperty("browser"));
        if (System.getProperty("browser").equals("Chrome"))
            return chromeWebDriver;
        else
            return firefoxdriver;
    }
}
