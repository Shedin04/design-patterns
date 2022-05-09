package com.shedin.desktop.fragments;

import com.shedin.abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NavigationBarFragment extends AbstractFragment {

	@FindBy(css = ".home-icon-link")
	private WebElement homeButton;

	@FindBy(css = ".mob-nav-account > a[href*='/login']")
	private WebElement loginButton;

	public NavigationBarFragment(WebDriver driver) {
		super(driver);
	}

	public boolean isHomeButtonDisplayed() {
		return homeButton.isDisplayed();
	}

	public boolean isLoginButtonDisplayed() {
		return loginButton.isDisplayed();
	}
}