package com.shedin.abstractclasses.page;

import com.shedin.desktop.fragments.NavigationBarFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public abstract class AbstractPage extends WebObject {
	private final By navigationBar = By.cssSelector(".user-nav");

	private String pageUrl;

	protected AbstractPage(WebDriver driver) {
		super(driver);
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public void openPage() {
		driver.get(driver.getCurrentUrl() + pageUrl);
	}

	public NavigationBarFragment getNavigationBarFragment() {
		NavigationBarFragment navigationBarFragment = new NavigationBarFragment(driver);
		navigationBarFragment.setRootElement(driver.findElement(navigationBar));
		return navigationBarFragment;
	}
}