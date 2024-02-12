package autotest.opencart.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InMessagePage {
    public WebDriver driver;
    private WebElement msgTitle;
    public InMessagePage(WebDriver driver) {
        this.driver=driver;
        try { Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initElements();
    }
    private void initElements() {
        System.out.println("le InMessagePage start");
        	msgTitle=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]"));
        System.out.println("le InMessagePage end");
    }

    public WebElement getMsgTitle() {
        return msgTitle;
    }
    public boolean isDisplayedEmailTo() {
        return getMsgTitle().isDisplayed();
    }
}
