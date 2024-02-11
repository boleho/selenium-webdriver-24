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
	//	 Assert.assertTrue(lp.isDisplayedAccountName());
		 Assert.assertTrue(lp.isDisplayedRefreshButton());
	//	 System.out.println("leAccount name = "+lp.getAccountNameText());

	//	 lp.clickRefreshButton();

		 lp.clickCreateMessage()
				 .switchToMessage()
				 .setEmail("acc_second24@yopmail.com")
				 .setSubject("task webdriver")
				 .setBody("le, it's a message to check");

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
	//	Assert.assertTrue(lp.isDisplayedAccountName());
		Assert.assertTrue(lp.isDisplayedRefreshButton());
	//	System.out.println("leAccount name = "+lp.getAccountNameText());

		lp.clickRefreshButton();


		System.out.println("lework");

		delay(6);

		System.out.println("=====================");
	}


}