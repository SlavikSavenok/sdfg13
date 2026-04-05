package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import servises.WaitsService;

public abstract class BasePage {

    protected WebDriver pageDriver;
    protected WaitsService waitsService;

    public BasePage(WebDriver driver) {
        this.pageDriver = driver;
        this.waitsService = new WaitsService(driver);
    }

    protected void click(By locator) {
        waitsService.waitAndClick(locator);
    }


}
