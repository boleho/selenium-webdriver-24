package autotest.mailserv.tests;

import autotest.mailserv.driver.DriverSingleton;
import autotest.mailserv.pages.guest.TopPart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
public abstract class OpenCartTestRunner {
    private static final Long ONE_SECOND_DELAY = 1000L;
    protected WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = DriverSingleton.getDriver();
        driver.get("https://yopmail.com/en/");
        System.out.println("\t\t@BeforeClass");}
    @AfterClass
    public void afterClass() {
        DriverSingleton.closeDriver();
        System.out.println("\t\t@AfterClass");}
    @BeforeTest
    public void beforeTest() {
        System.out.println("\t@BeforeTest");}
    @AfterTest
    public void afterTest() {
        System.out.println("\t@AfterTest");}
    public TopPart loadApplication() {
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


