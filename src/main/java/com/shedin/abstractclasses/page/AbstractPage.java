package com.shedin.abstractclasses.page;

import com.shedin.desktop.fragments.NavigationBarFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class AbstractPage {
	protected WebDriver driver;
	private final By navigationBar = By.cssSelector(".user-nav");
	private NavigationBarFragment navigationBarFragment;
	private String pageUrl;

	protected AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public void openPage() {
		driver.get(driver.getCurrentUrl() + pageUrl);
	}

	public NavigationBarFragment getNavigationBarFragment() {
		if (navigationBarFragment == null) {
			navigationBarFragment = new NavigationBarFragment(driver);
			navigationBarFragment.setRootElement(driver.findElement(navigationBar));
		}
		return navigationBarFragment;
	}
}