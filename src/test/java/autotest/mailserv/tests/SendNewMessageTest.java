package autotest.mailserv.tests;

import autotest.mailserv.data.repository.UserRepository;
import autotest.mailserv.pages.guest.*;
import autotest.mailserv.service.UserCreator;
import autotest.mailserv.service.Uzer;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SendNewMessageTest extends TestRunner {
	 @Test
	//public void sendMessage(User correctUser) {
		 public void sendMessage() {
		 Uzer testUser = UserCreator.withCredentialsFromProperty();

		 LoginedPage lp = loadApplication()
				 .fillFields1(testUser)
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