package autotest.opencart.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginedPage {
	public WebDriver driver;
	private WebElement accountName;
	private WebElement createMessage;
	private WebElement refreshButton;
	public LoginedPage(WebDriver driver) {
		this.driver = driver;
		initElements();
	}
	private void initElements() {
	// delay to wait page loading to have selector visible
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	accountName = driver.findElement(By.xpath("//div[contains(text(),'acc_first24@yopmail.com')]"));
		createMessage = driver.findElement(By.xpath("//i[contains(text(),'\uE150')]"));
		refreshButton = driver.findElement(By.xpath("//button[@id='refresh']"));
	}
	// accountName
	public WebElement getAccountName() {
		return accountName;
	}
	public String getAccountNameText() {
		return getAccountName().getText();
	}
	public boolean isDisplayedAccountName() {
		return getAccountName().isDisplayed();
	}
	// createMessage
	public WebElement getCreateMessage() {
		return createMessage;
	}
	public ChangeFrame clickCreateMessage() {
		getCreateMessage().click();
		try { Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new ChangeFrame(driver);
	}
	public boolean isDisplayedCreateMessage() {
		return getCreateMessage().isDisplayed();
	}
	// refreshButton
	public WebElement getRefreshButton() {
		return refreshButton;
	}

	public void clickRefreshButton() {
		getRefreshButton().click();
	}
	public boolean isDisplayedRefreshButton() {
		return getRefreshButton().isDisplayed();
	}

}
