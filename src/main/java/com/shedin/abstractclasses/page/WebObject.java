package com.shedin.abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class WebObject {
	protected WebDriver driver;
	protected long WAIT_EL = 5;

	protected WebObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected void waitElement(WebElement element) {
		try {
			new WebDriverWait(driver, WAIT_EL).until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) {
			System.err.println("There is no element: " + e.getMessage());
		}
	}
}