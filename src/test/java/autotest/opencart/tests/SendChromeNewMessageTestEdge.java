package autotest.opencart.tests;

import autotest.opencart.data.repository.User;
import autotest.opencart.data.repository.UserRepository;
import autotest.opencart.pages.guest.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SendChromeNewMessageTestEdge extends OpenCartTestRunnerEdge {
	@DataProvider
	public Object[][] correctUsers() {
		return new Object[][] { { UserRepository.get().correctUser() } };}
	 @Test(dataProvider = "correctUsers")
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
	}
}