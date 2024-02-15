package autotest.mailserv.tests;

import autotest.mailserv.data.repository.User;
import autotest.mailserv.data.repository.UserRepository;
import autotest.mailserv.pages.guest.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CheckChromeIncomeMessageTestChrome extends OpenCartTestRunnerChrome {
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

		lp.clickRefreshButton();

		InMessagePage imp=lp
				.clickChangeFrame()
				.switchToInMessage();

		Assert.assertEquals(imp.getInSubject().getText(), UserRepository.SUBJECT);
		Assert.assertEquals(imp.getInBody().getText(), UserRepository.BODY);

		//next line instead of following four lines
		Assert.assertTrue(imp.getSender().getText().contains(UserRepository.ACCOUNT1));
		/*String actual = imp.getSender().getText();
		int strLength = actual.length();
		actual = actual.substring(1, strLength-1);
		Assert.assertEquals(actual, UserRepository.ACCOUNT1);*/

		delay(2);
	}
}