package com.shedin.abstractclasses.page;

import org.openqa.selenium.WebDriver;


public abstract class AbstractPage extends WebObject {
	private String pageUrl;

	protected AbstractPage(WebDriver driver) {
		super(driver);
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void openPage() {
		driver.get(driver.getCurrentUrl() + pageUrl);
	}
}