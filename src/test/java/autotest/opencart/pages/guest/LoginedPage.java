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
		accountName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]"));
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
	public LoginedPage clickCreateNewMessage() {
		getCreateMessage().click();
		return this;
	}
	public boolean isDisplayedCreateMessage() {
		return getCreateMessage().isDisplayed();
	}
	// refreshButton
	public WebElement getRefreshButton() {
		return refreshButton;
	}

	public LoginedPage clickRefreshButton() {
		getRefreshButton().click();
		return this;
	}
	public boolean isDisplayedRefreshButton() {
		return getRefreshButton().isDisplayed();
	}

	public ChangeFrame clickChangeFrame() {
		return new ChangeFrame(driver);
	}
}