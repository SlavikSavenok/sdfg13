package tests;

import org.junit.jupiter.api.Test;

public class Tests extends tests.BaseTest {

    @Test
    public void openBrowser() throws InterruptedException {
        long start = System.currentTimeMillis();

        driver.get("https://ask42.us");
        homePage.clickCoursesButton();
        coursesPage.clickPythonCourse();
        pythonIntroductionPage.openWhileLoopChapter();
        String titleText = whileLoopPage.getPageTitleText();
        assert titleText.contains("Цикл while и его применение в Python");

        long elapsed = System.currentTimeMillis() - start;
        if (elapsed < 15000) {
            Thread.sleep(15000 - elapsed);
        }
    }
}