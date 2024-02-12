package autotest.opencart.pages.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class NewMessagePage {
	public WebDriver driver;
	private WebElement msgTitle;
	private WebElement emailTo;
	private WebElement subject;
	private WebElement body;
	private WebElement send;
	public NewMessagePage(WebDriver driver) {
		this.driver=driver;
		try { Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		initElements();
	}
	private void initElements() {
		System.out.println("le NewMessagePage start");
	//	msgTitle=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]"));
		emailTo = driver.findElement(By.xpath("//input[@id='msgto']"));
		subject = driver.findElement(By.xpath("//input[@id='msgsubject']"));
		body = driver.findElement(By.xpath("//div[@id='msgbody']"));
		send= driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
		System.out.println("le NewMessagePage end");
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
		try { Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		try { Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		try { Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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