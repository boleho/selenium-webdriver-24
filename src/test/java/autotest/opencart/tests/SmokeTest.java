package autotest.opencart.tests;

import autotest.opencart.data.repository.User;
import autotest.opencart.data.repository.UserRepository;
import autotest.opencart.pages.guest.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SmokeTest extends OpenCartTestRunner {
	@DataProvider
	public Object[][] correctUsers() {
		return new Object[][] { { UserRepository.get().correctUser() } };}
	 //@Test(dataProvider = "correctUsers")
	public void sendMessage(User correctUser) {

		 LoginedPage lp = loadApplication()
				 .fillFields(correctUser)
				 .clickSubmitLogin();

		 Assert.assertTrue(lp.isDisplayedCreateMessage());
		 Assert.assertTrue(lp.isDisplayedAccountName());
		 Assert.assertTrue(lp.isDisplayedRefreshButton());
		 System.out.println("leAccount name = "+lp.getAccountNameText());

		 lp.clickCreateMessage()
				 .switchToMessage()
				 .setEmail(UserRepository.ACCOUNT2)
				 .setSubject(UserRepository.SUBJECT)
				 .setBody(UserRepository.BODY);

		 WebElement sendBtn=driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
		sendBtn.click();
		 System.out.println("le done");

		delay(4);

		System.out.println("=====================");
	}
	@DataProvider
	public Object[][] correctUsers2() {
		return new Object[][] { { UserRepository.get().correctUser2() } };}
	@Test(dataProvider = "correctUsers2")
	public void receiveMessage(User correctUser) {

		LoginedPage lp = loadApplication()
				.fillFields(correctUser)
				.clickSubmitLogin();

		Assert.assertTrue(lp.isDisplayedCreateMessage());
		Assert.assertTrue(lp.isDisplayedAccountName());
		Assert.assertTrue(lp.isDisplayedRefreshButton());
		System.out.println("leAccount name = "+lp.getAccountNameText());

		lp.clickRefreshButton();

		lp.clickCreateMessage();
		System.out.println("lework 1");
		WebElement letter =
				driver.findElement(By.xpath("///body/div[2]/div[2]/button[1]/div[1]/span[2]"));
		System.out.println("le letter  = "+letter.getText());
		Assert.assertEquals(letter.getText(), UserRepository.ACCOUNT1);
		System.out.println("lework 2");
		/*lp.clickChangeFrame()
						.switchToMessage()
				.getEmailTo()
				.getText();

						WebElement sender = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/button[1]/div[1]/span[2]"));

		Assert.assertEquals(sender.getText(), UserRepository.ACCOUNT1);

		WebElement subject = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[3]/div[1]"));

		Assert.assertEquals(subject.getText(), UserRepository.SUBJECT);

		WebElement body = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]"));

		Assert.assertEquals(body.getText(), UserRepository.BODY);
*/


		delay(6);

		System.out.println("=====================");
	}


}