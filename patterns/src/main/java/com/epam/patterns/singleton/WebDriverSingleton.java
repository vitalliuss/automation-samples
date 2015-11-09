package com.epam.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {}

    public static WebDriver getWebDriverInstance() {
        if (null == driver) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeWebBrowser(){
        driver.quit();
        driver = null;
    }

}
