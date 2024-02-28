package autotest.mailserv.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ChangeFrame {
    private final Logger logger = LogManager.getRootLogger();
    public WebDriver driver;
    private WebElement ifmail;

    public ChangeFrame(WebDriver driver) {
        this.driver=driver;
        initElements();
    }
    private void initElements() {
        ifmail=driver.findElement(By.xpath("//iframe[@id='ifmail']"));
    }
    // ifmail
    public WebElement getIfmail() {
        return ifmail;
    }
    public NewMessagePage switchToNewMessage() {
        driver.switchTo().frame(getIfmail());
        logger.info("NewMessage page opened");
        return new NewMessagePage(driver);
    }
    public InMessagePage switchToInMessage() {
        driver.switchTo().frame(getIfmail());
        logger.info("InMessage page opened");
        return new InMessagePage(driver);
    }
}
