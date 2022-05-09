package com.shedin.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.shedin.driver.SingletonDriver.getDriver;


public class WebDriverWaiter {
	private static final long WAIT_EL = 5;

	private WebDriverWaiter() {}

	public static void waitElement(WebElement element
	) {
		try {
			new WebDriverWait(getDriver(), WAIT_EL).until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) {
			System.err.println("There is no element: " + e.getMessage());
		}
	}
}
