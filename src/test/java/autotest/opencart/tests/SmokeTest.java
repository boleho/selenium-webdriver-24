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

		 Assert.assertEquals(lp.getAccountNameText(), UserRepository.ACCOUNT1);

		 NewMessagePage nmp=lp.clickCreateNewMessage()
				 .clickChangeFrame()
				 .switchToNewMessage()
				 .setEmail(UserRepository.ACCOUNT2)
				 .setSubject(UserRepository.SUBJECT)
				 .setBody(UserRepository.BODY);

		 nmp.clickSend();

		 delay(2);

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

		Assert.assertEquals(lp.getAccountNameText(), UserRepository.ACCOUNT2);

		InMessagePage imp=lp
				.clickChangeFrame()
				.switchToInMessage();

		Assert.assertEquals(imp.getInSubject().getText(), UserRepository.SUBJECT);
		Assert.assertEquals(imp.getInBody().getText(), UserRepository.BODY);

		String actual = imp.getSender().getText();
		int strLength = actual.length();
		actual = actual.substring(1, strLength-1);
		Assert.assertEquals(actual, UserRepository.ACCOUNT1);

		delay(2);

		System.out.println("=====================");
	}


}