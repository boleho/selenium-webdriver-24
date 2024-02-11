package autotest.opencart.pages.guest;

import autotest.opencart.data.repository.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
	public WebDriver driver;
	private WebElement email;
	private WebElement submit;
	public TopPart(WebDriver driver) {
		this.driver = driver;
		initElements();
	}
	private void initElements() {
		email = driver.findElement(By.xpath("//input[@id='login']"));
		submit = driver.findElement(By.xpath("//i[contains(text(),'\uE5C8')]"));
	}
	// email field
	public WebElement getEmail() {
		return email;
	}
	public void clickEmail() {
		getEmail().click();
	}
	public void clearEmail() {
		getEmail().clear();
	}

	// submit button
	public WebElement getSubmit() {
		return submit;
	}
	public void clickSubmit() {
		getSubmit().click();
	}
	public LoginedPage clickSubmitLogin() {
		clickSubmit();
		return new LoginedPage(driver);
	}
	public boolean isDisplayedSubmit() {
		return getSubmit().isDisplayed();
	}
	// Functional
	public TopPart setEmail(User user) {
		clickEmail();
		clearEmail();
		getEmail().sendKeys(user.getEmail());
		return this;
	}
	public TopPart fillFields(User user) {
		this.setEmail(user);
		return this;
	}
}