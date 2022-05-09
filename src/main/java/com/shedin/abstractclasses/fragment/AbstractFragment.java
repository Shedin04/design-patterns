package com.shedin.abstractclasses.fragment;

import com.shedin.abstractclasses.page.WebObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractFragment extends WebObject {

    private WebElement rootElement;

    protected AbstractFragment(WebDriver driver) {
        super(driver);
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public boolean isDisplayed() {
        return getRootElement().isDisplayed();
    }
}