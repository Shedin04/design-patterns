package com.shedin.pagetest;

import com.shedin.desktop.pages.AccountPage;
import com.shedin.driver.CapabilitiesHelper;
import com.shedin.driver.SingletonDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Optional;

import static com.shedin.constants.Constants.ACCOUNT_PAGE_URL;
import static com.shedin.constants.Constants.BASE_URL;
import static org.junit.Assert.assertTrue;


public class AccountPageTest {
	private CapabilitiesHelper capabilitiesHelper;
	protected AccountPage accountPage;

	@Before
	public void setUpTest() {
		WebDriver driver = SingletonDriver.getDriver();
		driver.get(BASE_URL);
		capabilitiesHelper = new CapabilitiesHelper(driver);
	}

	@After
	public void closeDriver() {
		Optional.of(SingletonDriver.getDriver()).ifPresent(WebDriver::quit);
	}

	@Test
	public void smokeTest() {
		accountPage = capabilitiesHelper.getAccountPage();
		accountPage.setPageUrl(ACCOUNT_PAGE_URL);
		accountPage.openPage();
		assertTrue("There is no 'Sign Up' text on the Account Page", accountPage.isSubscribeEmailTextDisplayed());
		assertTrue("There is no 'Sign Up email' form on the Account Page", accountPage.isSubscribeEmailInputDisplayed());
		assertTrue("There is no 'Sign Up' button on the Account Page", accountPage.isSubscribeEmailButtonDisplayed());
		assertTrue("There is no 'Navigation bar' fragment",
				   accountPage.getNavigationBarFragment().isDisplayed());
		assertTrue("There is no 'Home button' on the 'Navigation bar' fragment",
				   accountPage.getNavigationBarFragment().isHomeButtonDisplayed());
		assertTrue("There is no 'Login button' on the 'Navigation bar' fragment",
				   accountPage.getNavigationBarFragment().isLoginButtonDisplayed());
	}
}