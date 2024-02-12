package autotest.opencart.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class NewMessagePage {
	public WebDriver driver;
	private WebElement emailTo;
	private WebElement subject;
	private WebElement body;
	private WebElement send;
	public NewMessagePage(WebDriver driver) {
		this.driver=driver;
		initElements();
	}
	private void initElements() {
		try { Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		emailTo = driver.findElement(By.xpath("//input[@id='msgto']"));
		subject = driver.findElement(By.xpath("//input[@id='msgsubject']"));
		body = driver.findElement(By.xpath("//div[@id='msgbody']"));
		send= driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
	}
	// emailTo field
	public WebElement getEmailTo() {
		return emailTo;
	}
	public void clickEmailTo() {
		getEmailTo().click();
	}
	public void clearEmailTo() {
		getEmailTo().clear();
	}
	public NewMessagePage setEmail(String email) {
		clickEmailTo();
		clearEmailTo();
		getEmailTo().sendKeys(email);
		return this;
	}
	public String getEmailToText() {
		return getEmailTo().getAttribute("name");
	}
	public boolean isDisplayedEmailTo() {
		return getEmailTo().isDisplayed();
	}
	// subject field
	public WebElement getSubject() {
		return subject;
	}
	public void clickSubject() {
		getSubject().click();
	}
	public void clearSubject() {
		getSubject().clear();
	}
	public NewMessagePage setSubject(String subject) {
		clickSubject();
	    clearSubject();
		getSubject().sendKeys(subject);
		return this;
	}
	public String getSubjectText() {
		return getSubject().getAttribute("name");
	}
	public boolean isDisplayedSubject() {
		return getSubject().isDisplayed();
	}
	// body
		public WebElement getBody() {
			return body;
		}
		public void clickBody() {
			getBody().click();
		}
		public void clearBody() {
		getBody().clear();
	}
		public String getBodyText() {
			return getBody().getAttribute("alt");
		}
		public boolean isDisplayedBody() {
			return getBody().isDisplayed();
		}
	public NewMessagePage setBody(String body) {
		clickBody();
		clearBody();
		getBody().sendKeys(body);
		return this;
	}
	// send
	public WebElement getSend() {
		return send;
	}
	public void clickSend() {
		getSend().click();
	}

}