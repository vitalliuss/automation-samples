package com.epam.patterns.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance {

	private static WebDriver instance;

	public static WebDriver getInstance() {
		if (instance == null) {
			instance = new FirefoxDriver();
		}
		return instance;				
	}
}
