package baseEntities;

import org.openqa.selenium.WebDriver;
import services.WaitsService;

public abstract class BasePage {

    protected WebDriver pageDriver;
    protected WaitsService waitsService;

    public BasePage(WebDriver driver) {
        this.pageDriver = driver;
        this.waitsService = new WaitsService(driver);
    }
}
