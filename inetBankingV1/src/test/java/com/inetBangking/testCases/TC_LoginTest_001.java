package com.inetBangking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBangking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {

		logger.info("URL is opened");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(UserName);
		logger.info("Entered the UserName");
		loginPage.setPassword(Password);
		logger.info("Entered the Password");
		loginPage.clickSubmit();
		logger.info("Clicked the login button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}

}
