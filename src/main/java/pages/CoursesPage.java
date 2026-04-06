package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesPage extends BasePage {

    private final By PYTHON_INTRODUCTION_BUTTON = By.xpath("//a[@href='/course/python-introduction/']//div[@class='readmore__text']");

    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    public void clickPythonCourse(){
        waitsService.waitAndClick(PYTHON_INTRODUCTION_BUTTON);
    }
}
