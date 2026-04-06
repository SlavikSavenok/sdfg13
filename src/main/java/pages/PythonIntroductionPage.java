package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PythonIntroductionPage extends BasePage {

    private final By WHILE_LOOP_CHAPTER_LINK = By.xpath("//a[@href='/course/python-introduction/chapter/loops/']");

    public PythonIntroductionPage(WebDriver driver) {
        super(driver);
    }

    public void openWhileLoopChapter() {
        waitsService.waitAndClick(WHILE_LOOP_CHAPTER_LINK);
    }
}
