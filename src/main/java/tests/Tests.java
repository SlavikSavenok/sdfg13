package tests;

import org.junit.jupiter.api.Test;

public class Tests extends tests.BaseTest {   // наследуем BaseTest

    @Test
    public void openBrowser() throws InterruptedException {
        driver.get("https://ask42.us");
        homePage.clickCoursesButton();
        Thread.sleep(3000);
        System.out.println("Браузер открыт, сайт загружен");

    }
}