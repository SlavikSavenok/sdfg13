package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    private final By COURSES_BUTTON_LOCATOR = By.xpath("//div[@class='header']//a[@href='/courses/']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCoursesButton(){
        waitsService.waitAndClick(COURSES_BUTTON_LOCATOR);
    }
}