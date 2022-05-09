package com.shedin.driver;

import com.shedin.desktop.pages.AccountPage;
import org.openqa.selenium.WebDriver;


public class CapabilitiesHelper {
	private final WebDriver driver;

	public CapabilitiesHelper(WebDriver driver) {
		this.driver = driver;
	}

	public AccountPage getAccountPage() {
		return new AccountPage(driver);
	}
}