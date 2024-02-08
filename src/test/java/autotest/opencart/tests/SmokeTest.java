package autotest.opencart.tests;

import autotest.opencart.data.repository.UserRepository;
import autotest.opencart.pages.guest.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SmokeTest extends OpenCartTestRunner {

	@DataProvider
	public Object[][] correctUsers() {
		return new Object[][] { {
				UserRepository.get().correctUser()
		} };
	}
	 @Test
	public void smokeTest(IUser correctUser) {

		 TopPart topPart = loadApplication();

		//Assert.assertTrue(topPart.isDisplayedLogo());
		//System.out.println("== Logo = " + topPart.getLogoText());

		topPart.fillFields(correctUser);

		delay(2);

		System.out.println("=====================");
	}


}