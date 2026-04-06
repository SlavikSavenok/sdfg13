package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhileLoopPage extends BasePage {

    private final By PAGE_TITLE_LOCATOR = By.xpath("//*[@class='h2 text-center title title-bg active-element activated']");

    public WhileLoopPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitleText() {
        return pageDriver.findElement(PAGE_TITLE_LOCATOR).getText();
    }
}
