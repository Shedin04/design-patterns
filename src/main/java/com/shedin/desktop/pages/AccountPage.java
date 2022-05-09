package com.shedin.desktop.pages;

import com.shedin.abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends AbstractPage {

	@FindBy(css = ".signup-text")
	private WebElement subscribeEmailText;

	@FindBy(css = ".newsletter-form input")
	private WebElement subscribeEmailInput;

	@FindBy(css = ".newsletter-form button")
	private WebElement subscribeEmailButton;

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public boolean isSubscribeEmailTextDisplayed() {
		waitElement(subscribeEmailText);
		return subscribeEmailText.isDisplayed();
	}

	public boolean isSubscribeEmailInputDisplayed() {
		waitElement(subscribeEmailInput);
		return subscribeEmailInput.isDisplayed();
	}

	public boolean isSubscribeEmailButtonDisplayed() {
		waitElement(subscribeEmailButton);
		return subscribeEmailButton.isDisplayed();
	}
}