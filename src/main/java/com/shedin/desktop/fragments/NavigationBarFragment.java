package com.shedin.desktop.fragments;

import com.shedin.abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationBarFragment extends AbstractFragment {
	private final By homeButtonBy = By.cssSelector(".home-icon-link");
	private final By loginButtonBy = By.cssSelector(".mob-nav-account > a[href*='/login']");

	public NavigationBarFragment(WebDriver driver) {
		super(driver);
	}

	public boolean isHomeButtonDisplayed() {
		return getRootElement().findElement(homeButtonBy).isDisplayed();
	}

	public boolean isLoginButtonDisplayed() {
		return getRootElement().findElement(loginButtonBy).isDisplayed();
	}
}