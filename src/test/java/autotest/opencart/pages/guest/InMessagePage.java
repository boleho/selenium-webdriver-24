package autotest.opencart.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InMessagePage {
    public WebDriver driver;
    private WebElement inSubject;
    private WebElement sender;
    private WebElement inBody;
    public InMessagePage(WebDriver driver) {
        this.driver=driver;
        initElements();
    }
    private void initElements() {
        inSubject =driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]"));
        sender = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[2]/span[1]"));
        inBody = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]"));
    }
    // inSubject
    public WebElement getInSubject() {
        return inSubject;
    }
    public boolean isDisplayedInSubject() {
        return getInSubject().isDisplayed();
    }
    // sender
    public WebElement getSender() {
        return sender;
    }
    public boolean isDisplayedSender() {
        return getSender().isDisplayed();
    }
    // inBody
    public WebElement getInBody() {
        return inBody;
    }
    public boolean isDisplayedInBody() {
        return getInBody().isDisplayed();
    }
}
