package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.CoursesPage;
import pages.HomePage;
import pages.PythonIntroductionPage;
import pages.WhileLoopPage;
import services.BrowsersService;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected CoursesPage coursesPage;
    protected PythonIntroductionPage pythonIntroductionPage;
    protected WhileLoopPage whileLoopPage;

    @BeforeEach
    void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
        homePage = new HomePage(driver);
        coursesPage = new CoursesPage(driver);
        pythonIntroductionPage = new PythonIntroductionPage(driver);
        whileLoopPage = new WhileLoopPage(driver);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}