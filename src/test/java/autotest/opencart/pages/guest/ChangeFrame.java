package autotest.opencart.pages.guest;

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

        System.out.println("le ChangeFrame start");
        ifmail=driver.findElement(By.xpath("//iframe[@id='ifmail']"));
        System.out.println("le ChangeFrame end");
    }
    // ifmail
    public WebElement getIfmail() {
        return ifmail;
    }
    public NewMessagePage switchToNewMessage() {
        driver.switchTo().frame(getIfmail());
        System.out.println("switchToMessage done");
        try { Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new NewMessagePage(driver);
    }
    public InMessagePage switchToInMessage() {
        driver.switchTo().frame(getIfmail());
        System.out.println("switchToInMessage done");
        try { Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new InMessagePage(driver);
    }
}
