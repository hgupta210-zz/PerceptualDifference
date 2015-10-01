import juice.driverClass;

import org.openqa.selenium.WebDriver;

import ImageProcessing.ImageProcessing;
import SiteContext.siteContext;

import com.google.inject.Inject;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class EndecaUpgrade {
    private WebDriver wD1, wD2;
    private ImageProcessing imageProcessing;
    private siteContext context;

    @Inject
    public EndecaUpgrade(driverClass d, ImageProcessing imageProcessing, siteContext context) {
        this.wD1 = d.getDriver1();
        this.wD2 = d.getDriver2();
        this.imageProcessing = imageProcessing;
        this.context = context;
    }

    public void openEndecaPage(
            String oldEndeca, String newEndeca, String pageNo)
            throws Throwable {
        wD1.get(oldEndeca);
        wD2.get(newEndeca);
        imageProcessing.saveScreenshot(pageNo);
    }

}
