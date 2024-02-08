

package autotest.opencart.pages.guest;

import autotest.opencart.data.repository.IUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
	
	protected WebDriver driver;

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
	// Page Object

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

	public String getEmailText() {
		return getEmail().getText();
	}

	// submit button

	public WebElement getSubmit() {
		return submit;
	}

	public void clickSubmit() {
		getSubmit().click();
	}

	public SuccessLoginPage clickSubmitLogin() {
		clickSubmit();
		return new SuccessLoginPage(driver);
	}
	public FailedLoginPage clickSubmitNotlogin() {
		clickSubmit();
		return new FailedLoginPage(driver);
	}

	public String getSubmitText() {
		return getSubmit().getText();
	}

	public boolean isDisplayedSubmit() {
		return getSubmit().isDisplayed();
	}

	// Functional

	public TopPart setEmail(IUser user) {
		clickEmail();
		clearEmail();
		getEmail().sendKeys(user.getEmail());
		return this;
	}

	public TopPart fillFields(IUser user) {
		this.setEmail(user);
		return this;
	}


	// Functional

	// Business Logic
	
}