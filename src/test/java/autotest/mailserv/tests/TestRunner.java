package autotest.mailserv.tests;

import autotest.mailserv.driver.DriverSingleton;
import autotest.mailserv.pages.guest.TopPart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public abstract class TestRunner {
    private static final Long ONE_SECOND_DELAY = 1000L;
    protected WebDriver driver;
    @BeforeMethod()
    public void setUp()
    {
        driver = DriverSingleton.getDriver();
        System.out.println("\t\t@BeforeMethod");
    }
@AfterMethod(alwaysRun = true)
public void stopBrowser()
{
    DriverSingleton.closeDriver();
    System.out.println("\t\t@AfterMethod");}
    public TopPart loadApplication() {
        driver.get("https://yopmail.com/en/");
        return new TopPart(driver);}
    protected void delay() {
        delay(1);}
    protected void delay(int seconds) {
        try { Thread.sleep(seconds*ONE_SECOND_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


