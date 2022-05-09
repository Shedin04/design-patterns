package com.shedin.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;


public class SingletonDriver {
	private static WebDriver driver;

	private SingletonDriver() {

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
}