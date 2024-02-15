package autotest.mailserv.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeFrame {
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
        return new NewMessagePage(driver);
    }
    public InMessagePage switchToInMessage() {
        driver.switchTo().frame(getIfmail());
        return new InMessagePage(driver);
    }
}
